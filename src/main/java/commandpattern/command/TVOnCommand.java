package commandpattern.command;

import commandpattern.device.TV;

public class TVOnCommand implements Command{

  private final TV tv;

  public TVOnCommand(final TV tv) {
    this.tv = tv;
  }
  @Override
  public void execute() {
    tv.on();
  }

  @Override
  public void undo() {
    tv.off();
  }
}
