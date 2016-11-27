package stateofthings.state;

import stateofthings.GumballMachine;

public class WinnerState implements State{

  private final transient GumballMachine gumballMachine;

  public WinnerState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you a gumball");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, you already turned the crank");
  }

  @Override
  public void turnCrank() {
    System.out.println("Turning twice doesn't get you another gumball");
  }

  @Override
  public void dispense() {
    System.out.println("You're a WINNER! You get two gumballs for a quarter");

    this.gumballMachine.releaseBall();

    if (this.gumballMachine.checkHasGumballs()) {
      this.gumballMachine.releaseBall();

      if (this.gumballMachine.checkHasGumballs()) {
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
      } else {
        System.out.println("Ooops, out of gumballs");
        this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
      }
    } else {
      this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
    }
  }
}
