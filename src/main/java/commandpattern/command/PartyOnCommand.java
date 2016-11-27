package commandpattern.command;

public class PartyOnCommand implements Command{

  private final Command[] commands;

  public PartyOnCommand(final Command[] commands) {
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
