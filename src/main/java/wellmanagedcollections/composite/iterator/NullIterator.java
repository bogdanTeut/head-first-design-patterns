package wellmanagedcollections.composite.iterator;

import wellmanagedcollections.composite.MenuComponent;
import wellmanagedcollections.composite.MenuItem;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {
  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public MenuItem next() {
    return null;
  }
}
