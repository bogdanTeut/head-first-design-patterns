package factorypattern.ingredients;

import factorypattern.ingredients.cheese.Cheese;
import factorypattern.ingredients.cheese.GoatsCheese;
import factorypattern.ingredients.cheese.ReggianoCheese;
import factorypattern.ingredients.clams.Clams;
import factorypattern.ingredients.clams.FreshClams;
import factorypattern.ingredients.dough.Dough;
import factorypattern.ingredients.dough.ThinCrustDough;
import factorypattern.ingredients.dough.VeryThinCrustDough;
import factorypattern.ingredients.pepperoni.Pepperoni;
import factorypattern.ingredients.pepperoni.SlicedPepperoni;
import factorypattern.ingredients.sauce.BruschettaSauce;
import factorypattern.ingredients.sauce.MarinaSauce;
import factorypattern.ingredients.sauce.Sauce;
import factorypattern.ingredients.veggies.*;

public class CaliforniaIngredientsFactory implements IngredientsFactory {

  @Override
  public Dough createDough() {
    return new VeryThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new BruschettaSauce();
  }

  @Override
  public Cheese createCheese() {
    return new GoatsCheese();
  }

  @Override
  public Veggie[] createVeggies() {
    final Veggie[] veggies = {new Onion(), new RedPepper()};
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
