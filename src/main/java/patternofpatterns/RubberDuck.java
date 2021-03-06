package patternofpatterns;

public class RubberDuck implements Quackable{

  private final Observable observable;

  public RubberDuck() {
    this.observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Squeak");
    this.notifyObservers();
  }

  @Override
  public void registerObserver(final Observer observer) {
    this.observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    this.observable.notifyObservers();
  }

  @Override
  public String toString() {
    return "RubberDuck";
  }
}
