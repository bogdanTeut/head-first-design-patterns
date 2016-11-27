package commandpattern.command;

import commandpattern.device.CeilingFan;

public class PartyOffCommand implements Command{

  private final Command[] commands;

  public PartyOffCommand(final Command[] commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    for (int i=0; i < commands.length; i++){
      commands[i].execute();
    }
  }

  @Override
  public void undo() {
    for (int i=0; i < commands.length; i++){
      commands[i].undo();
    }
  }
}
