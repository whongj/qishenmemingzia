package di6zhangminglingmoshili2;

import di6zhangminglingmoshi.Command;
import di6zhangminglingmoshi.Light;

public class LightOffCommand implements Command{
	Light light;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
		
	}
	public LightOffCommand(Light light){
		this.light=light;
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
