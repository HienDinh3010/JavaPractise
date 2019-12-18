package com.designpattern.factorymethod.basic;

import com.designpattern.model.product.IProduct;
import com.designpattern.model.product.Toy;

public class ToyCreator extends Creator {

	@Override
	public IProduct factoryMethod() {
		// TODO Auto-generated method stub
		return new Toy();
	}

}
