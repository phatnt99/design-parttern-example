package com.nhom8.design.patterns.CreationalPatterns.AbstractFactory;

public class FactoryProvider {
	private FactoryProvider() {
		 
    }

     public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
         switch (materialType) {
         case PLASTIC:
             return new PlasticFactory();
         case WOOD:
             return new WoodFactory();
         default:
             throw new UnsupportedOperationException("This furniture is unsupported ");
         }
     }
	
}
enum MaterialType {
	PLASTIC,WOOD
}