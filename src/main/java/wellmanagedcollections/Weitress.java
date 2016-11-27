package wellmanagedcollections;

import wellmanagedcollections.composite.MenuComponent;

public class Weitress {
  private final MenuComponent menuComponent;

  public Weitress(final MenuComponent menuComponent) {
    this.menuComponent = menuComponent;
  }

  public void print(){
    this.menuComponent.print();
  }
}
