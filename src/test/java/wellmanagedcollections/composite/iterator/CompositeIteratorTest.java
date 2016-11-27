package wellmanagedcollections.composite.iterator;

import org.junit.Test;
import wellmanagedcollections.composite.Menu;
import wellmanagedcollections.composite.MenuComponent;
import wellmanagedcollections.composite.MenuItem;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CompositeIteratorTest {

  @Test
  public void givenOneMenuItemMenu_whenCallingHasNext_thenItShouldReturnTrue(){
    //preparing data
    final MenuItem menuItem = new MenuItem("menu item", "a menu item", true, 2.19);
    final Menu menu = new Menu("menu", "a menu");
    menu.add(menuItem);

    final CompositeIterator compositeIterator = new CompositeIterator(menu.iterator());

    //method under test
    final Boolean hasNext = compositeIterator.hasNext();

    //verifying results
    assertThat(hasNext, is(true));
  }

  @Test
  public void givenOneMenuItemMenu_whenCallingNext_thenItShouldReturnIt(){
    //preparing data
    final MenuItem menuItem = new MenuItem("menu item", "a menu item", true, 2.19);
    final Menu menu = new Menu("menu", "a menu");
    menu.add(menuItem);

    final CompositeIterator compositeIterator = new CompositeIterator(menu.iterator());

    //method under test
    final MenuComponent next = compositeIterator.next();

    //verifying results
    assertThat(next, is(menuItem));
  }

  @Test
  public void givenMenuWithMenuItem_whenCallingNextTwice_thenItShouldReturnIt(){
    //preparing data
    final MenuItem menuItem = new MenuItem("menu item", "a menu item", true, 2.19);
    final Menu subMenu = new Menu("submenu", "a sub menu");
    final Menu menu = new Menu("menu", "a menu");
    subMenu.add(menuItem);
    menu.add(subMenu);

    final CompositeIterator compositeIterator = new CompositeIterator(menu.iterator());

    //method under test
    MenuComponent next = compositeIterator.next();
    next = compositeIterator.next();

    //verifying results
    assertThat(next, is(menuItem));
  }

  @Test
  public void givenMenuWithMenuItem_whenCallingHasNextAfterNext_thenItShouldReturnTrue(){
    //preparing data
    final MenuItem menuItem = new MenuItem("menu item", "a menu item", true, 2.19);
    final Menu subMenu = new Menu("submenu", "a sub menu");
    final Menu menu = new Menu("menu", "a menu");
    subMenu.add(menuItem);
    menu.add(subMenu);

    final CompositeIterator compositeIterator = new CompositeIterator(menu.iterator());

    //method under test
    compositeIterator.next();
    final Boolean hasNext = compositeIterator.hasNext();

    //verifying results
    assertThat(hasNext, is(true));
  }

  @Test
  public void givenMenuWithMenuItemAndMenuItem_whenCallingHasNextAfterCallingNextTwice_thenItShouldReturnTrue(){
    //preparing data
    final MenuItem menuItemOne = new MenuItem("menu item one", "a menu item", true, 2.19);
    final MenuItem menuItemTwo = new MenuItem("menu item two", "a menu item", true, 2.19);
    final Menu subMenu = new Menu("submenu", "a sub menu");
    final Menu menu = new Menu("menu", "a menu");
    subMenu.add(menuItemOne);
    menu.add(subMenu);
    menu.add(menuItemTwo);

    final CompositeIterator compositeIterator = new CompositeIterator(menu.iterator());

    //method under test
    compositeIterator.next();
    compositeIterator.next();
    final Boolean hasNext = compositeIterator.hasNext();

    //verifying results
    assertThat(hasNext, is(true));
  }

  @Test
  public void givenMenuWithMenuItemAndMenuItem_whenCallingNextAfterCallingNextTwice_thenItShouldReturnTheMenuItem(){
    //preparing data
    final MenuItem menuItemOne = new MenuItem("menu item one", "a menu item", true, 2.19);
    final MenuItem menuItemTwo = new MenuItem("menu item two", "a menu item", true, 2.19);
    final Menu subMenu = new Menu("submenu", "a sub menu");
    final Menu menu = new Menu("menu", "a menu");
    subMenu.add(menuItemOne);
    menu.add(subMenu);
    menu.add(menuItemTwo);

    final CompositeIterator compositeIterator = new CompositeIterator(menu.iterator());

    //method under test
    compositeIterator.next();
    compositeIterator.next();
    final MenuComponent next = compositeIterator.next();

    //verifying results
    assertThat(next, is(menuItemTwo));
  }

}