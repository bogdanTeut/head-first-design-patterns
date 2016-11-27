package wellmanagedcollections.composite;

import wellmanagedcollections.composite.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{
  private final String name;
  private final String description;
  private final List<MenuComponent> menuItems;

  public Menu(final String name, final String description) {
    this.name = name;
    this.description = description;
    this.menuItems = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void add(final MenuComponent menuComponent){
    this.menuItems.add(menuComponent);
  }

  public void remove(final MenuComponent menuComponent){
    this.menuItems.remove(menuComponent);
  }

  public MenuComponent getChild(final int index){
    return this.menuItems.get(index);
  }

  public Iterator<MenuComponent> iterator(){
    return new CompositeIterator(menuItems.iterator());
  }

  public void print(){
    System.out.print("\n" + getName());
    System.out.println("  -- " + getDescription());
    System.out.println("------------------------");

    this.menuItems.forEach(menuComponent -> menuComponent.print());
  }
}
