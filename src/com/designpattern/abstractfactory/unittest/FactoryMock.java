package com.designpattern.abstractfactory.unittest;

import com.designpattern.abstractfactory.IFactory;
import com.designpattern.abstractfactory.model.IProductA;
import com.designpattern.abstractfactory.model.IProductB;

public class FactoryMock implements IFactory {

	@Override
	public IProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductAMock();
	}

	@Override
	public IProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductBMock();
	}

}
