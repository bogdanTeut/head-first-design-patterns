package factorypattern;

import factorypattern.ingredients.IngredientsFactory;
import factorypattern.ingredients.cheese.Cheese;
import factorypattern.ingredients.clams.Clams;
import factorypattern.ingredients.dough.Dough;
import factorypattern.ingredients.pepperoni.Pepperoni;
import factorypattern.ingredients.sauce.Sauce;
import factorypattern.ingredients.veggies.Veggie;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

  protected String name;
  protected Dough dough;
  protected Sauce sauce;
  protected Cheese cheese;
  protected Veggie[] veggies;
  protected Pepperoni pepperoni;
  protected Clams clams;
  protected IngredientsFactory ingredientsFactory;

  public abstract void prepare();

  public void bake() {
    System.out.println("Baking pizza for 25 minutes at 280 degrees");
  }

  public void cut() {
    System.out.println("Cutting pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Placing pizza in official PizzaStore box");
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setIngredientsFactory(final IngredientsFactory ingredientsFactory) {
    this.ingredientsFactory = ingredientsFactory;
  }
}
