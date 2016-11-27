package commandpattern.command;

import commandpattern.device.CeilingFan;

public class CeilingFanOnCommand implements Command{

  private final CeilingFan ceilingFan;

  public CeilingFanOnCommand(final CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    ceilingFan.on();
  }

  @Override
  public void undo() {
    ceilingFan.off();
  }
}
