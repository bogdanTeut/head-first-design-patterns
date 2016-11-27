package commandpattern.command;

import commandpattern.device.Hottube;

public class HottubeOffCommand implements Command{

  private final Hottube hottube;

  public HottubeOffCommand(final Hottube hottube) {
    this.hottube = hottube;
  }
  @Override
  public void execute() {
    hottube.off();
  }

  @Override
  public void undo() {
    hottube.on();
  }
}
