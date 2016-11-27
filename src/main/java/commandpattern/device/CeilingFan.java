package commandpattern.device;

public class CeilingFan {

  private final String room;

  public CeilingFan(final String room) {
    this.room = room;
  }

  public void on() {
    System.out.println(String.format("%s ceiling fan is On", room));
  }

  public void off() {
    System.out.println(String.format("%s ceiling fan is Off", room));
  }
}
