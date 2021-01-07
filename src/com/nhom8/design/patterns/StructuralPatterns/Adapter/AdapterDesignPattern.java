package com.nhom8.design.patterns.StructuralPatterns.Adapter;

//Client
public class AdapterDesignPattern
{
    public static void main(String[] args) {
        Compound unknown = new Compound("Unknown");
        unknown.display();

        Compound water = new RichCompound("Water");
        water.display();

        Compound benzene = new RichCompound("Benzene");
        benzene.display();

        Compound ethanol = new RichCompound("ethanol");
        ethanol.display();
    }
}
