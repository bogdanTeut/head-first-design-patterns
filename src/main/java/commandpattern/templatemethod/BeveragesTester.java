package commandpattern.templatemethod;

public class BeveragesTester {

  public static void main(String[] args) {
    final Coffee coffee = new Coffee();
    final Tea tea = new Tea();

    System.out.println("Preparing coffee");
    coffee.prepare();

    System.out.println();

    System.out.println("Preaparing tea");
    tea.prepare();
  }
}
