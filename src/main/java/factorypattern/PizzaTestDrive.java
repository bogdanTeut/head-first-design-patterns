package factorypattern;

import factorypattern.factory.CaliforniaPizzaShop;
import factorypattern.factory.ChicagoPizzaShop;
import factorypattern.factory.NYPizzaShop;

public class PizzaTestDrive {
  public static void main(String[] args) {
//pizza old style
//    final NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
//    final ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
//
//    final PizzaShop nyPizzaShop = new PizzaShop(nyPizzaFactory);
//    final PizzaShop chicagoPizzaShop = new PizzaShop(chicagoPizzaFactory);

//    final Pizza nyClamPizza = nyPizzaShop.orderPizza("clam");
//    final Pizza chicagoClamPizza = chicagoPizzaShop.orderPizza("clam");

    final PizzaShop nyPizzaShop = new NYPizzaShop();
    final PizzaShop chicagoPizzaShop = new ChicagoPizzaShop();
    final PizzaShop californiaPizzaShop = new CaliforniaPizzaShop();

    nyPizzaShop.orderPizza("cheese");
    chicagoPizzaShop.orderPizza("cheese");
    californiaPizzaShop.orderPizza("cheese");
  }
}
