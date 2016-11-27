package wellmanagedcollections.iterator;

import wellmanagedcollections.composite.MenuItem;

import java.util.List;

public class PancakeHouseMenuIterator implements java.util.Iterator{
  private final List<MenuItem> menuItems;
  private int position;

  public PancakeHouseMenuIterator(final List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    return position < menuItems.size() && menuItems.get(position) != null;
  }

  @Override
  public MenuItem next() {
    return menuItems.get(position++);
  }
}
