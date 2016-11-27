package wellmanagedcollections.composite;

import java.util.Iterator;

public abstract class MenuComponent {

  public void add(final MenuComponent menuComponent){
    throw new UnsupportedOperationException();
  }

  public void remove(final MenuComponent menuComponent){
    throw new UnsupportedOperationException();
  }

  public MenuComponent getChild(final int i){
    throw new UnsupportedOperationException();
  }

  public String getName(){
    throw new UnsupportedOperationException();
  }

  public String geDescription(){
    throw new UnsupportedOperationException();
  }

  public Double gePrice(){
    throw new UnsupportedOperationException();
  }

  public Boolean isVegetarian(){
    throw new UnsupportedOperationException();
  }

  public Iterator<MenuComponent> iterator(){
    throw new UnsupportedOperationException();
  }

  public void print(){
    throw new UnsupportedOperationException();
  }
}
