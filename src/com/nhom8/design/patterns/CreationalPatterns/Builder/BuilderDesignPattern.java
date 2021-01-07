package com.nhom8.design.patterns.CreationalPatterns.Builder;

//Client class
public class BuilderDesignPattern
{
    public static void main(String[] args) {
        //Builder Instance
        VehicleBuilder builder;
        //Director
        Shop shop = new Shop();
        //Create builders
        builder = new CarBuilder();
        shop.Construct(builder);
        builder.getVehicle().show();
        builder = new ScooterBuilder();
        shop.Construct(builder);
        builder.getVehicle().show();
        builder =  new MotorCycleBuilder();
        shop.Construct(builder);
        builder.getVehicle().show();
    }
}