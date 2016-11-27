package commandpattern.command;

import commandpattern.device.Light;

public class LightOffCommand implements Command{

  private final Light light;

  public LightOffCommand(final Light light) {
    this.light = light;
  }
  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }
}
