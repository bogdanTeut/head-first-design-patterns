package wellmanagedcollections;

import wellmanagedcollections.composite.Menu;
import wellmanagedcollections.composite.MenuComponent;
import wellmanagedcollections.composite.MenuItem;

public class MenuTestDrive {

  public static void main(String[] args) {
    final MenuComponent allMenu = new Menu("ALL MENUS", "All menus combined");

    final MenuComponent pancakeMenuHouse = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    pancakeMenuHouse.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99));
    pancakeMenuHouse.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
    pancakeMenuHouse.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
    pancakeMenuHouse.add(new MenuItem("Waffles", "Waffles, with your choices of blueberries or strawberries", true, 3.59));


    final MenuComponent dinerMenu = new Menu("DINNER MENU", "Lunch");
    dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fackin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
    dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
    dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
    dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));


    final MenuComponent coffeeMenu = new Menu("COFFEE MENU", "Dinner");
    coffeeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99));
    coffeeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
    coffeeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pito beans, salsa, guacamole", true, 4.29));


    final MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");
    dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
    dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York cheesecake, with chocolate graham crust Sorbet", true, 1.99));
    dessertMenu.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));


    dinerMenu.add(dessertMenu);
    allMenu.add(pancakeMenuHouse);
    allMenu.add(dinerMenu);
    allMenu.add(coffeeMenu);

    final Weitress weitress = new Weitress(allMenu);
    weitress.print();
  }

}
