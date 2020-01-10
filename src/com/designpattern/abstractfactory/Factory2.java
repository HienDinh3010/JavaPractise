package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.model.IProductA;
import com.designpattern.abstractfactory.model.IProductB;
import com.designpattern.abstractfactory.model.ProductA2;
import com.designpattern.abstractfactory.model.ProductB2;

public class Factory2 implements IFactory {

	@Override
	public IProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public IProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
