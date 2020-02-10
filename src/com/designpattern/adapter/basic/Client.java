package com.designpattern.adapter.basic;

public class Client {

	public static void main(String[] args) {
		ITarget target = new ObjectAdapter(new Adaptee());
		System.out.println(target.operation());
		
		ITarget classAdapterAdaptee = new ClassAdapterAdaptee();
		System.out.println(classAdapterAdaptee.operation());
	}

}
