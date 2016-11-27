package commandpattern.device;

public class Stereo {

  public void on() {
    System.out.println("Stereo is On");
  }

  public void off() {
    System.out.println("Stereo is Off");
  }

  public void setCD(){
    System.out.println("Set CD");
  }

  public void setVolume(final int volume){
    System.out.println(String.format("Volume set to %d", volume));
  }
}
