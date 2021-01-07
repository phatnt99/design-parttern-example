package com.nhom8.design.patterns.CreationalPatterns.Prototype;

public class Ship implements Prototype {
    private String name;
    private Integer crew;
    private Double fuel;
    private Captain captain;

    @Override
    public Prototype createClone() {
        return new Ship(name, crew, fuel, (Captain)getCaptain().createClone());
    }
    
    public Ship(String name, Integer crew, Double fuel, Captain captain) {
        this.name = name;
        this.crew = crew;
        this.fuel = fuel;
        this.captain = captain;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", crew=" + crew +
                ", fuel=" + fuel +
                ", captain=" + captain +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getCrew() {
        return crew;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public Captain getCaptain() {
        return captain;
    }
}
