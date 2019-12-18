package com.designpattern.factorymethod.basic;

import com.designpattern.model.product.IProduct;
import com.designpattern.model.product.Laptop;

public class LaptopCreator extends Creator {

	@Override
	public IProduct factoryMethod() {
		// TODO Auto-generated method stub
		return new Laptop();
	}

}
