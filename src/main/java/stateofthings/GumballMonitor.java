package stateofthings;

import java.rmi.RemoteException;

public class GumballMonitor {

  private final GumballMachineRemote gumballMachine;

  public GumballMonitor(final GumballMachineRemote gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void report (){
    try {
      System.out.println("Gumball machine : "+ gumballMachine.getLocation());
      System.out.println("Gumball inventory : "+ gumballMachine.getCount());
      System.out.println("Gumball state : "+ gumballMachine.getState());
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}
