package com.designpattern.abstractfactory.CentralizeObjectCreation;

/**
 * @author Hien
 * Concrete Factory with static factory methods.
 * For simple applications that do not need to create families of objects
 * but want to separate and centralize object creation.
 */
public class Client {
	public static void main(String[] args) {
		Factory1.createOrder();
		Factory1.createProduct();
	}
}
