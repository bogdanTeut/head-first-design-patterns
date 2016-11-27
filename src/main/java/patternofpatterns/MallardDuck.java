package patternofpatterns;

public class MallardDuck implements Quackable {

  private final Observable observable;

  public MallardDuck() {
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
    return "MallardDuck";
  }
}
