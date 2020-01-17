package com.designpattern.abstractfactory.CentralizeObjectCreation;

import com.designpattern.abstractfactory.model.IOrder;
import com.designpattern.abstractfactory.model.IProductA;
import com.designpattern.abstractfactory.model.Order1;
import com.designpattern.abstractfactory.model.ProductA1;

public class Factory1 {
	
	public static IOrder createOrder() {
		IOrder order1 = new Order1();
		System.out.println("Order is created with " + order1.getOrderId());
		return order1;
	}
	
	public static IProductA createProduct() {
		IProductA productA1 = new ProductA1();
		System.out.println("Product is created with " + productA1.getName());
		return productA1;
	}
}
