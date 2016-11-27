package commandpattern.device;

public class Light {

  private final String room;

  public Light(final String room) {
    this.room = room;
  }

  public void on() {
    System.out.println(String.format("%s light is On", room));
  }

  public void off() {
    System.out.println(String.format("%s light is Off", room));
  }
}
