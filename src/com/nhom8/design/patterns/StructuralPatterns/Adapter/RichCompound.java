package com.nhom8.design.patterns.StructuralPatterns.Adapter;

//Adapter class
public class RichCompound extends Compound
{
    private ChemicalBank chemicalBank;
    public RichCompound(String chemical) {
        super(chemical);
    }

    @Override
    public void display() {
        chemicalBank = new ChemicalBank();

        super.display();
        System.out.println("\nFormula: " + chemicalBank.getMolecularStructure(chemical));
        System.out.println("\nWeight " + chemicalBank.getMolecularWeight(chemical));
        System.out.println("\nMelting Pt: " +  chemicalBank.getCriticalPoint(chemical, "M"));
        System.out.println("\nBoiling Pt: " +  chemicalBank.getCriticalPoint(chemical, "B"));

    }
}
