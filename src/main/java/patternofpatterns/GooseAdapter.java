package patternofpatterns;

public class GooseAdapter implements Quackable{

  private final Observable observable;

  final Goose goose;

  public GooseAdapter(final Goose goose) {
    this.observable = new Observable(this);
    this.goose = goose;
  }

  @Override
  public void quack() {
    this.goose.honk();
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
    return "Goose pretending to be duck";
  }
}
