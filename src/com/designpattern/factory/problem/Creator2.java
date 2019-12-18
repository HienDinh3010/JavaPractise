package com.designpattern.factory.problem;

import com.designpattern.model.product.IProduct;
import com.designpattern.model.product.Laptop;

public class Creator2 {

	private IProduct product;
	
	public String operator() {
		product = new Laptop();
		return "Add product " + product.getName() + " to store";
	}
}
