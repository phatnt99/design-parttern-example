package com.nhom8.design.patterns.CreationalPatterns.Builder;

import java.util.Hashtable;

//Product
public class Vehicle
{
    private final String vehicleType;
    private final Hashtable<String, String> parts =
            new Hashtable<String, String>();

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPart(String name) {
        return parts.get(name);
    }

    public void setPart(String name, String value) {
        this.parts.put(name, value);
    }

    public void show() {
        System.out.println("\n-----");
        System.out.println("\nVehicle Type: " + vehicleType);
        System.out.println("\nFrame: " + this.getPart("frame"));
        System.out.println("\nEngine: " + this.getPart("engine"));
        System.out.println("\nWheels: " + this.getPart("wheels"));
        System.out.println("\nDoors: " + this.getPart("doors"));
    }
}
