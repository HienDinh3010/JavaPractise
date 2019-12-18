package com.designpattern.factorymethod.basic;

import com.designpattern.model.product.IProduct;

public abstract class Creator {
	private IProduct product;
	
	public abstract IProduct factoryMethod();
	
	public String operator() {
		product = factoryMethod();
		return "Add product: " + product.getName() + " to store";
	}
}
