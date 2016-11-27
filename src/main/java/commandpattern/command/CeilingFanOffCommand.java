package commandpattern.command;

import commandpattern.device.CeilingFan;

public class CeilingFanOffCommand implements Command{

  private final CeilingFan ceilingFan;

  public CeilingFanOffCommand(final CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    ceilingFan.off();
  }

  @Override
  public void undo() {
    ceilingFan.on();
  }
}
