package com.nhom8.design.patterns.BehaviorialPatterns.Command;


public class RemoteButton {
	Command theCommand;
	
	public RemoteButton(Command newCommand){
		
		theCommand=newCommand;		
	}
	
	
	public void press(){
		
		theCommand.execute();
	}
	
	
	public void pressUndo(){
		
		theCommand.undo();
	}
	

	
}
