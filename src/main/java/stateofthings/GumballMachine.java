package stateofthings;

import stateofthings.state.HasQuarterState;
import stateofthings.state.NoQuarterState;
import stateofthings.state.SoldOutState;
import stateofthings.state.SoldState;
import stateofthings.state.State;
import stateofthings.state.WinnerState;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine implements GumballMachineRemote {

  private final State noQuarterState;
  private final State hasQuarterState;
  private final State soldOutState;
  private final State soldState;
  private final State winnerState;
  private final String location;

  private State state;
  private int count = 0;

  public GumballMachine(final String location, final int count) throws RemoteException{
    this.location = location;
    this.noQuarterState = new NoQuarterState(this);
    this.hasQuarterState = new HasQuarterState(this);
    this.soldOutState = new SoldOutState(this);
    this.soldState = new SoldState(this);
    this.winnerState = new WinnerState(this);
    this.count = count;

     if (this.count > 0){
       this.state = noQuarterState;
     } else {
       this.state = soldOutState;
     }
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Not enough params");
      System.exit(1);
    }

    try {
      final int count = Integer.parseInt(args[1]);

      if (System.getSecurityManager() == null) {
        System.setSecurityManager(new SecurityManager());
      }

      LocateRegistry.createRegistry(1099);

      final GumballMachine gumballMachine = new GumballMachine(args[0], count);

      Registry registry = LocateRegistry.getRegistry();
      registry.rebind("gumballmachine", (GumballMachineRemote)UnicastRemoteObject.exportObject(gumballMachine, 0));
    } catch (final Exception e) {
      e.printStackTrace();
    }
  }

  public void releaseBall(){
    System.out.println("A gumball comes rolling out the slot");
    this.count = this.count -1;
  }

  public boolean checkEnoughGumballsForWinner(){
    return this.count > 1;
  }

  public boolean checkHasGumballs(){
    return this.count > 0;
  }

  public State getState() {
    return this.state;
  }

  public void setState(final State state) {
    this.state = state;
  }

  public State getNoQuarterState() {
    return this.noQuarterState;
  }

  public State getHasQuarterState() {
    return this.hasQuarterState;
  }

  public State getSoldOutState() {
    return this.soldOutState;
  }

  public State getSoldState() {
    return this.soldState;
  }

  public State getWinnerState() {
    return this.winnerState;
  }

  public void insertQuarter (){
    this.state.insertQuarter();
  }

  public void ejectQuarter(){
    this.state.ejectQuarter();
  }

  public void turnCrank(){
    this.state.turnCrank();
    this.state.dispense();
  }

  public String getLocation() {
    return location;
  }

  public int getCount() {
    return count;
  }

  @Override
  public String toString(){
    final StringBuffer sb = new StringBuffer()
            .append("\n")
            .append("Mighty Gumball, Inc.")
            .append("\n")
            .append("Java-enabled Standing Gumball Model #2004\n")
            .append("Inventory: ").append(this.count).append(this.count==0?" gumball":" gumballs")
            .append("\n")
            .append(stateToString())
            .append("\n");

    return sb.toString();

  }

  public String stateToString(){
    if (this.state == soldOutState){
      return "Machine is sold out";
    } else if (this.state == noQuarterState){
      return "Machine is waiting for quarter";
    } else if(this.state == hasQuarterState){
      return "Machine has quarter";
    } else if (this.state == soldState){
      return "Machine is sold out";
    }

    return null;
  }
}
