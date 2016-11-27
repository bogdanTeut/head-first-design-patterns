package commandpattern.command;

import commandpattern.device.TV;

public class TVOffCommand implements Command{

  private final TV tv;

  public TVOffCommand(final TV tv) {
    this.tv = tv;
  }
  @Override
  public void execute() {
    tv.off();
  }

  @Override
  public void undo() {
    tv.on();
  }
}
