package com.nhom8.design.patterns.CreationalPatterns.Builder;

//ConcreteBuilder
public class ScooterBuilder extends VehicleBuilder
{
    public ScooterBuilder() {
        vehicle = new Vehicle("Scooter");
    }

    @Override
    public void BuildFrame() {
        vehicle.setPart("frame", "Scooter Frame");
    }

    @Override
    public void BuildEngine() {
        vehicle.setPart("engine", "50 CC");
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
