package com.nhom8.design.patterns.BehaviorialPatterns.Command;

public class TurnOffCommand implements Command {

	TV theDevice;
	
	public TurnOffCommand(TV newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.off();
		
	}

	
	
	public void undo() {
		
		theDevice.on();
		
	}
	
}