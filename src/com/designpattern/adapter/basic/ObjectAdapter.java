package com.designpattern.adapter.basic;

public class ObjectAdapter implements ITarget {
	private Adaptee adaptee;

	public ObjectAdapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public String operation() {
		// TODO Auto-generated method stub
		return adaptee.specificOperation();
	}
	
	
}
