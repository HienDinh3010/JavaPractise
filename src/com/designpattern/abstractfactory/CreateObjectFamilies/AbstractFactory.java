package com.designpattern.abstractfactory.CreateObjectFamilies;

import com.designpattern.abstractfactory.model.IProductA;
import com.designpattern.abstractfactory.model.IProductB;
import com.designpattern.abstractfactory.model.ProductA1;
import com.designpattern.abstractfactory.model.ProductA2;
import com.designpattern.abstractfactory.model.ProductB1;
import com.designpattern.abstractfactory.model.ProductB2;

/**
 * Creating families of objects. Ensuring that a family of related or dependent objects
 * is created and used together (consistent object families).
 *
 */
public abstract class AbstractFactory {
	private static AbstractFactory instance;

	public final static AbstractFactory getInstance() {
		if (instance == null) {
			instance = new Factory1();
		}
		return instance;
	}
	
	public abstract IProductA createProductA();
	public abstract IProductB createProductB();
	
	private static class Factory1 extends AbstractFactory {

		@Override
		public IProductA createProductA() {
			System.out.println("Create product A1");
			return new ProductA1();
		}

		@Override
		public IProductB createProductB() {
			System.out.println("Create product B1");
			return new ProductB1();
		}
		
	}
	
	private static class Factory2 extends AbstractFactory {

		@Override
		public IProductA createProductA() {
			System.out.println("Create product A2");
			return new ProductA2();
		}

		@Override
		public IProductB createProductB() {
			System.out.println("Create product B2");
			return new ProductB2();
		}
		
	}
}
