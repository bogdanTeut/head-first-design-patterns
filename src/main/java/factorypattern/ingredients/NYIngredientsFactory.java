package factorypattern.ingredients;

import factorypattern.ingredients.cheese.Cheese;
import factorypattern.ingredients.cheese.ReggianoCheese;
import factorypattern.ingredients.clams.Clams;
import factorypattern.ingredients.clams.FreshClams;
import factorypattern.ingredients.dough.Dough;
import factorypattern.ingredients.dough.ThinCrustDough;
import factorypattern.ingredients.pepperoni.Pepperoni;
import factorypattern.ingredients.pepperoni.SlicedPepperoni;
import factorypattern.ingredients.sauce.MarinaSauce;
import factorypattern.ingredients.sauce.Sauce;
import factorypattern.ingredients.veggies.*;

public class NYIngredientsFactory implements IngredientsFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggie[] createVeggies() {
    final Veggie[] veggies = {new Garlic(), new Onion(), new Mushrooms(), new RedPepper()};
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams() {
    return new FreshClams();
  }
}
