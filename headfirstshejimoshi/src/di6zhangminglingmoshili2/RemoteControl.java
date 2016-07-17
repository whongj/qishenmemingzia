package di6zhangminglingmoshili2;

import di6zhangminglingmoshi.Command;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl(){
		onCommands =new Command[7];
		offCommands=new Command[7];
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++){
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		onCommands[slot]=onCommand;
		offCommands[slot]=offCommand;
		
	}
	public void onButtonWasPushed(int slot){
		onCommands[slot].execute();
	}
	public void offButtoWasPushed(int slot){
		offCommands[slot].execute();

	}
	public String toSting(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n-----------------Remote Control------------\n");
		for(int i=0;i<onCommands.length;i++){
			stringBuff.append("[slot"+i+"]"+onCommands[i].getClass().getName()+"      "+offCommands[i].getClass().getName()+"\n");
		}
		return stringBuff.toString();
	}
}