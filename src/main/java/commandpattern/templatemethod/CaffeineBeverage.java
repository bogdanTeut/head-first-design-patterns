package commandpattern.templatemethod;

public abstract class CaffeineBeverage {

  final void prepare(){
    boilWatter();
    brew();
    pourInCup();
    if (customerWantsCondiments()){
      addCondiments();
    }
  }

  /**
   * hook method to decide weather that condiments should be added or not
   * @return
   */
  protected boolean customerWantsCondiments() {
    return true;
  }

  protected abstract void addCondiments();

  private void pourInCup() {
    System.out.println("Pouring in cup");
  }

  protected abstract void brew();

  private void boilWatter(){
    System.out.println("Boiling water");
  };

}
