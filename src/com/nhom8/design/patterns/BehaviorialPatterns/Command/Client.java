package com.nhom8.design.patterns.BehaviorialPatterns.Command;

public class Client {
	public static void main(String[] args){
		
		TV myTV =new TV();
		
		TurnOnCommand onCommand=new TurnOnCommand(myTV);
		RemoteButton onPressed=new RemoteButton(onCommand);
		onPressed.press();
		
		TurnOffCommand offCommand=new TurnOffCommand(myTV);
		onPressed=new RemoteButton(offCommand);
		onPressed.press();
		
		TurnUpCommand upCommand=new TurnUpCommand(myTV);
		onPressed=new RemoteButton(upCommand);
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		onPressed.pressUndo();
		onPressed.pressUndo();

	}
}
