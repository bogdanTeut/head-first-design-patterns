package patternofpatterns;

public class RedheadDuck implements Quackable {

  private final Observable observable;

  public RedheadDuck() {
    this.observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Quack");
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
    return "RedheadDuck";
  }
}
