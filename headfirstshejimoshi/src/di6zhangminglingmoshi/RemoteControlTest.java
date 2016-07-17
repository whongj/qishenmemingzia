package di6zhangminglingmoshi;

public class RemoteControlTest {
	public static void main(String[] args){
		SimpleRemoteControl remote=new SimpleRemoteControl();
		Light light =  new Light("屎蛋");
		LightOnCommand lightOn=new LightOnCommand(light);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
	}
}
