package com.nhom8.design.patterns.BehaviorialPatterns.Command;

public class TurnUpCommand implements Command {

	TV theDevice;
	
	public TurnUpCommand(TV newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.volumeUp();
		
	}

	public void undo() {
		
		theDevice.volumenDown();
		
	}
	
}