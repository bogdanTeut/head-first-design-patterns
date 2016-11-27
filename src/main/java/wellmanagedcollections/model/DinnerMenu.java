package wellmanagedcollections.model;

import wellmanagedcollections.composite.MenuItem;
import wellmanagedcollections.iterator.DinnerMenuIterator;

import java.util.Iterator;

public class DinnerMenu implements Menu{
  private static final int MAX_ITEMS = 6;
  private int numberOfItems;
  private final MenuItem[] menuItems;

  public DinnerMenu() {
    this.menuItems = new MenuItem[MAX_ITEMS];

    this.addMenuItem("Vegetarian BLT", "(Fackin') Bacon with lettuce & tomato on whole wheat", true, 2.99);

    this.addMenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);

    this.addMenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);

    this.addMenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
  }

  public void addMenuItem(final String name, final String description, final Boolean vegetarian, final Double price){
    final MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

    if (numberOfItems < MAX_ITEMS){
      menuItems[numberOfItems++] = menuItem;
    } else {
      System.out.println("Sorry menu is full! Can't add item to menu");
    }
  }

  public Iterator createIterator() {
    return new DinnerMenuIterator(menuItems);
  }
}
