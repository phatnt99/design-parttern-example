package com.nhom8.design.patterns.CreationalPatterns.FactoryMethod;

public class ErrorXMLDisplayService extends XMLParserService{
	@Override
    public XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
