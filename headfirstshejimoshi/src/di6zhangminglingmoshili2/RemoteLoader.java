package di6zhangminglingmoshili2;

import di6zhangminglingmoshi.Light;
import di6zhangminglingmoshi.LightOnCommand;

public class RemoteLoader {
	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();
		
		
		Light livingRoomLight=new Light("Living Room");
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		CeilingFanMediumCommand ceilingFanMedium=new CeilingFanMediumCommand(ceilingFan);
		
	}
}
