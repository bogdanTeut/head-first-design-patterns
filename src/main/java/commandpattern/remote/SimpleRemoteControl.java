package commandpattern.remote;

import commandpattern.command.Command;

public class SimpleRemoteControl {
  private Command slot;

  public void setCommand(final Command command){
    slot = command;
  }

  public void buttonWasPressed(){
    slot.execute();
  }

}
