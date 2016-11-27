package patternofpatterns;

public class QuackCounter implements Quackable{
  private final Quackable quackable;
  private static Integer counter = 0;

  public QuackCounter(final Quackable quackable) {
    this.quackable = quackable;
  }

  @Override
  public void quack() {
    counter++;
    this.quackable.quack();
  }

  public static Integer getCounter() {
    return counter;
  }

  @Override
  public void registerObserver(final Observer observer) {
    this.quackable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    this.quackable.notifyObservers();
  }
}
