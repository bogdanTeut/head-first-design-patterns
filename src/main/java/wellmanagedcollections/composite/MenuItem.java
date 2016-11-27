package wellmanagedcollections.composite;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import wellmanagedcollections.composite.iterator.NullIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
  private final String name;
  private final String description;
  private final Boolean vegetarian;
  private final Double price;

  public MenuItem(final String name, final String description, final Boolean vegetarian, final Double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Boolean isVegetarian() {
    return vegetarian;
  }

  public Double getPrice() {
    return price;
  }

  public Iterator<MenuComponent> iterator(){
    return new NullIterator();
  }

  public void print(){
    System.out.print(" " + getName());
    if (isVegetarian()){
      System.out.print("(V)");
    }
    System.out.println(", " + getPrice());
    System.out.println("  -- " + getDescription());
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;

    if (o == null || getClass() != o.getClass()) return false;

    final MenuItem menuItem = (MenuItem) o;

    return new EqualsBuilder()
            .append(name, menuItem.name)
            .append(description, menuItem.description)
            .append(vegetarian, menuItem.vegetarian)
            .append(price, menuItem.price)
            .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
            .append(name)
            .append(description)
            .append(vegetarian)
            .append(price)
            .toHashCode();
  }
}
