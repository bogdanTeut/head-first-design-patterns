package factorypattern.ingredients;

import factorypattern.ingredients.cheese.Cheese;
import factorypattern.ingredients.cheese.ReggianoCheese;
import factorypattern.ingredients.clams.Clams;
import factorypattern.ingredients.clams.FreshClams;
import factorypattern.ingredients.clams.FrozenClams;
import factorypattern.ingredients.dough.Dough;
import factorypattern.ingredients.dough.ExtraThickCrustDough;
import factorypattern.ingredients.dough.ThinCrustDough;
import factorypattern.ingredients.pepperoni.FullPepperoni;
import factorypattern.ingredients.pepperoni.Pepperoni;
import factorypattern.ingredients.pepperoni.SlicedPepperoni;
import factorypattern.ingredients.sauce.MarinaSauce;
import factorypattern.ingredients.sauce.PlumTomatoSauce;
import factorypattern.ingredients.sauce.Sauce;
import factorypattern.ingredients.veggies.*;

public class ChicagoIngredientsFactory implements IngredientsFactory {

  @Override
  public Dough createDough() {
    return new ExtraThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
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
    return new FullPepperoni();
  }

  @Override
  public Clams createClams() {
    return new FrozenClams();
  }
}
