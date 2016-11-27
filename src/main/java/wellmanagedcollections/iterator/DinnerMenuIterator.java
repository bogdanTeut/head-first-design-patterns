package wellmanagedcollections.iterator;

import wellmanagedcollections.composite.MenuItem;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
  private final MenuItem[] menuItems;
  private int position;

  public DinnerMenuIterator(final MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    return position < menuItems.length && menuItems[position+1] != null;
  }

  @Override
  public MenuItem next() {
    return menuItems[position++];
  }
}
