package com.designprinciple.FIRST_;

public class VietnamCustomer extends AbstractCustomer {

	@Override
	public void order() {
		System.out.println("Customer order in Vietnam");
	}

	@Override
	public void getLanguage() {
		System.out.println("Vietnam");
	}

}
