package com.nhom8.design.patterns.BehaviorialPatterns.Command;

public class TurnDownCommand implements Command {

	TV theDevice;
	
	public TurnDownCommand(TV newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.volumeUp();
		
	}

	public void undo() {
		
		theDevice.volumenDown();
		
	}
	
}