package commandpattern.device;

public class Hottube {

  public void on() {
    System.out.println(String.format("Hottube is heating to a steaming 104 degrees"));
    System.out.println(String.format("Hottube is bubbling"));
  }

  public void off() {
    System.out.println(String.format("Hottube is cooling to a steaming 98 degrees"));
  }
}
