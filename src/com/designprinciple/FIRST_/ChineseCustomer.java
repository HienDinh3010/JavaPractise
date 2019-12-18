package com.designprinciple.FIRST_;

public class ChineseCustomer extends AbstractCustomer {

	@Override
	public void order() {
		System.out.println("Customer order in Chinese");
	}

	@Override
	public void getLanguage() {
		System.out.println("Chinese");
	}

}
