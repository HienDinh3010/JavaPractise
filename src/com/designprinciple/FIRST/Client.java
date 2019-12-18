package com.designprinciple.FIRST;

/**
 * Program on interface, not on implementation = Client depends on interface, not implementation.
 * @author dnmhi
 *
 */
public class Client {

	private static IStrategy strategy;
	
	public static void main(String[] args) {
		strategy = new Strategy1();
		strategy.operator();
	}
}
