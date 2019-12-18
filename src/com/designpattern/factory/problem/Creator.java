package com.designpattern.factory.problem;

import com.designpattern.model.product.IProduct;
import com.designpattern.model.product.Toy;

public class Creator {

	private IProduct product;
	
	public String operator() {
		product = new Toy();
		return "Add product " + product.getName() + " to store";
	}
}
