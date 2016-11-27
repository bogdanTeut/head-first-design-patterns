package commandpattern.command;

import commandpattern.device.Stereo;

public class StereoOnWithCDCommand implements Command{

  private final Stereo stereo;

  public StereoOnWithCDCommand(final Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }

  @Override
  public void undo() {
    stereo.off();
  }
}
