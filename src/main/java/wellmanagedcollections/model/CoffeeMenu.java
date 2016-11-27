package wellmanagedcollections.model;

import wellmanagedcollections.composite.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CoffeeMenu implements Menu{
  private final Map<String, MenuItem> menuItems;

  public CoffeeMenu() {
    this.menuItems = new HashMap<>();

    this.addMenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99);

    this.addMenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);

    this.addMenuItem("Burrito", "A large burrito, with whole pito beans, salsa, guacamole", true, 4.29);
  }

  public void addMenuItem(final String name, final String description, final Boolean vegetarian, final Double price){
    final MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

    this.menuItems.put(name, menuItem);
  }

  public Iterator createIterator() {
    return menuItems.values().iterator();
  }
}
