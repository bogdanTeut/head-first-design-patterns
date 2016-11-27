package factorypattern.pizza;

import factorypattern.Pizza;

public class VeggiePizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientsFactory.createDough();
    sauce = ingredientsFactory.createSauce();
    cheese = ingredientsFactory.createCheese();
    veggies = ingredientsFactory.createVeggies();
  }
}
