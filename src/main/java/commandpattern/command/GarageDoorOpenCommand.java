package commandpattern.command;

import commandpattern.device.GarageDoor;

public class GarageDoorOpenCommand implements Command{

  private final GarageDoor garageDoor;

  public GarageDoorOpenCommand(final GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  @Override
  public void execute() {
    garageDoor.on();
  }

  @Override
  public void undo() {
    garageDoor.off();
  }
}
