package com.nhom8.design.patterns.CreationalPatterns.Builder;

//ConcreteBuilder
public class CarBuilder extends VehicleBuilder
{
    public CarBuilder() {
        vehicle = new Vehicle("Car");
    }

    @Override
    public void BuildFrame() {
        vehicle.setPart("frame", "Car Frame");
    }

    @Override
    public void BuildEngine() {
        vehicle.setPart("engine", "1000 CC");
    }

    @Override
    public void BuildWheels() {
        vehicle.setPart("wheels", "4");
    }

    @Override
    public void BuildDoors() {
        vehicle.setPart("doors", "4");
    }
}
