package patternofpatterns;

public class Quackologist implements Observer {

  @Override
  public void update(final QuackObservable duck) {
    System.out.println(String.format("Quackologist: " + duck + " just quacked."));
  }
}
