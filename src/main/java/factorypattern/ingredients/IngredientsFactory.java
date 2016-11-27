package factorypattern.ingredients;

import factorypattern.ingredients.cheese.Cheese;
import factorypattern.ingredients.clams.Clams;
import factorypattern.ingredients.dough.Dough;
import factorypattern.ingredients.pepperoni.Pepperoni;
import factorypattern.ingredients.sauce.Sauce;
import factorypattern.ingredients.veggies.Veggie;

public interface IngredientsFactory {
  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
  Veggie[] createVeggies();
  Pepperoni createPepperoni();
  Clams createClams();
}
