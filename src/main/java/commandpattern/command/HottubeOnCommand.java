package commandpattern.command;

import commandpattern.device.Hottube;

public class HottubeOnCommand implements Command{

  private final Hottube hottube;

  public HottubeOnCommand(final Hottube hottube) {
    this.hottube = hottube;
  }
  @Override
  public void execute() {
    hottube.on();
  }

  @Override
  public void undo() {
    hottube.off();
  }
}
