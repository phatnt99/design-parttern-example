package com.nhom8.design.patterns.StructuralPatterns.Adapter;

//Target class
public class Compound
{
    protected String chemical;
    protected float boilingPoint;
    protected float meltingPoint;
    protected double molecularWeight;
    protected String molecularFormula;

    public Compound(String chemical) {
        this.chemical = chemical;
    }

    public void display() {
        System.out.println("\n-----");
        System.out.println("\nCompound: " + this.chemical);
    }
}
