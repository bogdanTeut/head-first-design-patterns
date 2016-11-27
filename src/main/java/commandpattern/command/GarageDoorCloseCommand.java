package commandpattern.command;

import commandpattern.device.GarageDoor;

public class GarageDoorCloseCommand implements Command{

  private final GarageDoor garageDoor;

  public GarageDoorCloseCommand(final GarageDoor garageDoor) {
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
