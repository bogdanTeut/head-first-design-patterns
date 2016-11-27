package commandpattern.device;

public class TV {

  private final String room;

  public TV(final String room) {
    this.room = room;
  }

  public void on() {
    System.out.println(String.format("%s tv is On", room));
  }

  public void off() {
    System.out.println(String.format("%s tv is Off", room));
  }
}
