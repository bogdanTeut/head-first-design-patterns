package commandpattern.command;

import commandpattern.device.Stereo;

public class StereoOffWithCDCommand implements Command{

  private final Stereo stereo;

  public StereoOffWithCDCommand(final Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }

  @Override
  public void undo() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }
}
