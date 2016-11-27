package commandpattern.remote;

import commandpattern.command.Command;
import commandpattern.command.NoCommand;

public class RemoteControl {
  private final Command[] onCommands;
  private final Command[] offCommands;
  private Command undo;

  public RemoteControl() {
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];

    NoCommand noCommand = new NoCommand();

    for (int i = 0; i < 7; i++){
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }

    undo = noCommand;
  }

  public void setCommand(final int slot, final Command onCommand, final Command offCommand){
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(final int slot){
    onCommands[slot].execute();
    undo = onCommands[slot];
  }

  public void offButtonWasPushed(final int slot){
    offCommands[slot].execute();
    undo = offCommands[slot];
  }

  public void undoButtonWasPushed(){
    undo.undo();
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("\n---- Remote Control ----\n");

    for (int i = 0; i<7; i++){
      stringBuilder.append("[ slot " + i + "] " + onCommands[i].getClass().getName()
              + "    " + offCommands[i].getClass().getName() + "\n");
    }

    stringBuilder.append("[ undo ] " + undo.getClass().getName() + "\n");

    return stringBuilder.toString();

  }
}
