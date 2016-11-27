package commandpattern.templatemethod;

public class Tea extends CaffeineBeverage{

  @Override
  protected void brew() {
    System.out.println("Step the tea bag into the watter");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding milk");
  }
}
