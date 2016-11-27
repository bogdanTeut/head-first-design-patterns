package patternofpatterns;

public class DuckSimuator {

  public static void main(String[] args) {
    final DuckSimuator duckSimuator = new DuckSimuator();
    final AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
    final AbstractGooseFactory gooseFactory = new GooseFactory();
    duckSimuator.simulate(countingDuckFactory, gooseFactory);
  }

  private void simulate(final AbstractDuckFactory countingDuckFactory, final AbstractGooseFactory gooseFactory) {
    final Quackable redheadDuck = countingDuckFactory.createRedheadDuck();
    final Quackable duckCall = countingDuckFactory.createDuckCall();
    final Quackable rubberDuck = countingDuckFactory.createRubberDuck();
    final Quackable gooseDuck = gooseFactory.createDuck();

    final Flock flockOfDucks = new Flock();
    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);

    final Quackable mallardDuckOne = countingDuckFactory.createMallardDuck();
    final Quackable mallardDuckTwo = countingDuckFactory.createMallardDuck();
    final Quackable mallardDuckThree = countingDuckFactory.createMallardDuck();
    final Quackable mallardDuckFour = countingDuckFactory.createMallardDuck();

    mallardDuckFour.equals(mallardDuckOne);

    final Flock flockOfMallards = new Flock();
    flockOfMallards.add(mallardDuckOne);
    flockOfMallards.add(mallardDuckTwo);
    flockOfMallards.add(mallardDuckThree);
    flockOfMallards.add(mallardDuckFour);

    final Quackologist quackologist = new Quackologist();

    System.out.println("\n Duck Simulator: Whole Flock Simulation");
    flockOfDucks.registerObserver(quackologist);
    simulate(flockOfDucks);

    System.out.println("\n Duck Simulator: Mallard Flock Simulation");
    flockOfMallards.registerObserver(quackologist);
    simulate(flockOfMallards);

    System.out.println(String.format("The ducks quacked %s times", QuackCounter.getCounter()));
  }

  private void simulate(final Quackable duck) {

    duck.quack();
  }
}
