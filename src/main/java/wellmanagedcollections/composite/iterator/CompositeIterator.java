package wellmanagedcollections.composite.iterator;

import wellmanagedcollections.composite.Menu;
import wellmanagedcollections.composite.MenuComponent;
import wellmanagedcollections.composite.MenuItem;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
  private final Stack<Iterator<MenuComponent>> iteratorStack;

  public CompositeIterator(final Iterator<MenuComponent> iterator) {
    this.iteratorStack = new Stack<>();
    this.iteratorStack.push(iterator);
  }

  @Override
  public boolean hasNext() {
    if (this.iteratorStack.isEmpty()) {
      return false;
    } else{
      final Iterator<MenuComponent> iterator = this.iteratorStack.peek();

      final boolean hasNext = iterator.hasNext();

      if (hasNext == false) {
        this.iteratorStack.pop();
        return hasNext();
      } else {
        return true;
      }
    }

  }

  @Override
  public MenuComponent next() {
    if (hasNext()){
      final Iterator<MenuComponent> iterator = this.iteratorStack.peek();
      final MenuComponent next = iterator.next();

      if (next instanceof Menu){
        this.iteratorStack.push(next.iterator());
      }

      return next;
    } else {
      return null;
    }

  }
}
