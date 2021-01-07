package com.nhom8.design.patterns.CreationalPatterns.Builder;

//ConcreteBuilder
public class MotorCycleBuilder extends VehicleBuilder
{
    public MotorCycleBuilder() {
        vehicle = new Vehicle("MotorCycle");
    }

    @Override
    public void BuildFrame() {
        vehicle.setPart("frame", "MotoCrycle Frame");
    }

    @Override
    public void BuildEngine() {
        vehicle.setPart("engine", "150 CC");
    }

    @Override
    public void BuildWheels() {
        vehicle.setPart("wheels", "2");
    }

    @Override
    public void BuildDoors() {
        vehicle.setPart("doors", "0");
    }
}
