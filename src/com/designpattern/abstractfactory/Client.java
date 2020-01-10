package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.model.IProductA;
import com.designpattern.abstractfactory.model.IProductB;

public class Client {
	private IProductA productA;
	private IProductB productB;
	private IFactory factory;
	
	public Client(IFactory factory) {
		super();
		this.factory = factory;
	}
	
	public String operation() {
		System.out.println("Delegate initialize product to factory");
		productA = factory.createProductA();
		productB = factory.createProductB();
		return "Create " + productA.getName() + " and " + productB.getName();
	}
	
}
