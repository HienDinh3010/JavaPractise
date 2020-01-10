package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.model.IProductA;
import com.designpattern.abstractfactory.model.IProductB;
import com.designpattern.abstractfactory.model.ProductA1;
import com.designpattern.abstractfactory.model.ProductB1;

public class Factory1 implements IFactory {

	@Override
	public IProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public IProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
