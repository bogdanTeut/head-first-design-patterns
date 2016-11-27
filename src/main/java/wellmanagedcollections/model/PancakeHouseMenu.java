package wellmanagedcollections.model;


import wellmanagedcollections.composite.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
  private final List<MenuItem> menuItems;

  public PancakeHouseMenu() {
    this.menuItems = new ArrayList<>();

    this.addMenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);

    this.addMenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);

    this.addMenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);

    this.addMenuItem("Waffles", "Waffles, with your choices of blueberries or strawberries", true, 3.59);
  }

  public void addMenuItem(final String name, final String description, final Boolean vegetarian, final Double price){
    final MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  public Iterator createIterator() {
    return menuItems.iterator();
  }
}
