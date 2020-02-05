package com.designpattern.builder;

public class Director {
	private ComplexObject complexObject;
	private IBuilder builder;
	
	public Director(IBuilder builder) {
		this.builder = builder;
	}
	
	public String contruct() {
		System.out.println("Director: Delegate building complex object to Builder");
		builder.buildPartA();
		builder.buildPartB();
		complexObject = builder.getResult();
		return "Hello from "+ complexObject.getParts() + " object";
	}
}
