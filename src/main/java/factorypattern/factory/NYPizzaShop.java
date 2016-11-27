package factorypattern.factory;

import factorypattern.Pizza;
import factorypattern.PizzaShop;
import factorypattern.ingredients.IngredientsFactory;
import factorypattern.ingredients.NYIngredientsFactory;
import factorypattern.pizza.*;

public class NYPizzaShop extends PizzaShop{
  public Pizza createPizza(final String type){
    Pizza pizza;

    final IngredientsFactory ingredientsFactory = new NYIngredientsFactory();

    if (type.equals("cheese")){
      pizza = new CheesePizza();
      pizza.setIngredientsFactory(ingredientsFactory);
      pizza.setName("New York Style Cheese Pizza");
    }else if (type.equals("clam")){
      pizza = new ClamPizza();
      pizza.setIngredientsFactory(ingredientsFactory);
      pizza.setName("New York Style Clam Pizza");
    }else if (type.equals("veggie")){
      pizza = new VeggiePizza();
      pizza.setIngredientsFactory(ingredientsFactory);
      pizza.setName("New York Style Veggie Pizza");
    }else if (type.equals("greek")){
      pizza = new GreekPizza();
      pizza.setIngredientsFactory(ingredientsFactory);
      pizza.setName("New York Style Greek Pizza");
    }else{
      pizza = new PepperoniPizza();
      pizza.setIngredientsFactory(ingredientsFactory);
      pizza.setName("New York Style Pepperoni Pizza");
    }

    return pizza;
  }
}
