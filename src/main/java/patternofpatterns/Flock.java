package patternofpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {

  private final List<Quackable> ducksFlock;

  public Flock() {
    this.ducksFlock = new ArrayList<>();
  }

  public void add(final Quackable quackable) {
    this.ducksFlock.add(quackable);
  }

  @Override
  public void quack() {
    final Iterator<Quackable> quackableIterator = ducksFlock.iterator();

    while (quackableIterator.hasNext()) {
      quackableIterator.next().quack();
    }

  }

  @Override
  public void registerObserver(final Observer observer) {
    final Iterator<Quackable> quackableIterator = ducksFlock.iterator();

    while (quackableIterator.hasNext()) {
      quackableIterator.next().registerObserver(observer);
    }
  }

  @Override
  public void notifyObservers() {
    final Iterator<Quackable> quackableIterator = ducksFlock.iterator();

    while (quackableIterator.hasNext()) {
      quackableIterator.next().notifyObservers();
    }
  }
}
