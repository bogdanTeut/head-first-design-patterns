package stateofthings.state;

import stateofthings.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State{

  private final transient GumballMachine gumballMachine;
  private final Random random = new Random(System.currentTimeMillis());

  public HasQuarterState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You can't insert another quarter");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned...");

    if (isAWinner() && this.gumballMachine.checkEnoughGumballsForWinner()){
      this.gumballMachine.setState(this.gumballMachine.getWinnerState());
    } else {
      this.gumballMachine.setState(this.gumballMachine.getSoldState());
    }
  }

  private boolean isAWinner() {
    final int randomInt = this.random.nextInt(10);
    System.out.println("random int: " + randomInt);
    return randomInt == 0;
  }

  @Override
  public void dispense() {
      System.out.println("No gumball dispensed");
  }
}