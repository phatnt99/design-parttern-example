package com.nhom8.design.patterns.CreationalPatterns.Prototype;

public class Captain implements Prototype {
    private String name;
    private int height;
    private int weight;

    @Override
	public Prototype createClone() {
		// TODO Auto-generated method stub
		return new Captain(name, height, weight);
	}
    
    public Captain(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}