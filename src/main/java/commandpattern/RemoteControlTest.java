package commandpattern;

import commandpattern.command.*;
import commandpattern.device.*;
import commandpattern.remote.RemoteControl;
import commandpattern.remote.SimpleRemoteControl;

public class RemoteControlTest {
  public static void main(String[] args) {
    final Light livingRoomLight = new Light("Living Room");
    final LightOnCommand livingroomLightOnCommand = new LightOnCommand(livingRoomLight);
    final LightOffCommand livingroomLightOffCommand = new LightOffCommand(livingRoomLight);

    final Light kitchenLight = new Light("Kitchen Room");
    final LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
    final LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

    final CeilingFan ceilingFan = new CeilingFan("Living Room");
    final CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
    final CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

    final GarageDoor garageDoor = new GarageDoor();
    final GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    final GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

    final Stereo stereo = new Stereo();
    final StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
    final StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

    //party mode
    final TV tv = new TV("Living Room");
    final TVOnCommand tvOnCommand = new TVOnCommand(tv);
    final TVOffCommand tvOffCommand = new TVOffCommand(tv);
    final Hottube hottube = new Hottube();
    final HottubeOnCommand hottubeOnCommand = new HottubeOnCommand(hottube);
    final HottubeOffCommand hottubeOffCommand = new HottubeOffCommand(hottube);
    final Command[] partyOn = {livingroomLightOnCommand, stereoOnWithCDCommand, tvOnCommand, hottubeOnCommand};
    final Command[] partyOff = {livingroomLightOffCommand, stereoOffWithCDCommand, tvOffCommand, hottubeOffCommand};
    final PartyOnCommand partyOnCommand = new PartyOnCommand(partyOn);
    final PartyOnCommand partyOffCommand = new PartyOnCommand(partyOff);

    final SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    simpleRemoteControl.setCommand(livingroomLightOnCommand);
    simpleRemoteControl.buttonWasPressed();

    simpleRemoteControl.setCommand(garageDoorOpenCommand);
    simpleRemoteControl.buttonWasPressed();

    final RemoteControl remoteControl = new RemoteControl();
    remoteControl.setCommand(0, livingroomLightOnCommand, livingroomLightOffCommand);
    remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
    remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
    remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);
    remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffWithCDCommand);
    remoteControl.setCommand(5, partyOnCommand, partyOffCommand);

    System.out.println(remoteControl);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    remoteControl.undoButtonWasPushed();
    System.out.println(remoteControl);

    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    remoteControl.onButtonWasPushed(3);
    remoteControl.offButtonWasPushed(3);
    remoteControl.onButtonWasPushed(4);
    remoteControl.offButtonWasPushed(4);
    remoteControl.undoButtonWasPushed();
    System.out.println(remoteControl);

    remoteControl.onButtonWasPushed(5);
    remoteControl.offButtonWasPushed(5);


  }
}
