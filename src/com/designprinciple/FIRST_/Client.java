package com.designprinciple.FIRST_;

/**
 * Cleanly separate interface & implementation
 * @author dnmhi
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICustomer customer = new VietnamCustomer();
		customer.order();
		
		ICustomer customer2 = new ChineseCustomer();
		customer2.order();
	}

}
