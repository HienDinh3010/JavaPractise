package com.designpattern.builder;

import com.designpattern.builder.model.ProductA1;
import com.designpattern.builder.model.ProductB1;

public class Builder1 implements IBuilder {
	
	private ComplexObject complexObject = new ComplexObject();

	@Override
	public void buildPartA() {
		System.out.println("Builder1: Creating & assembling ProductA1");
		complexObject.add(new ProductA1());
	}

	@Override
	public void buildPartB() {
		System.out.println("Builder1: Creating & assembling ProductB1");
		complexObject.add(new ProductB1());
	}

	@Override
	public ComplexObject getResult() {
		// TODO Auto-generated method stub
		return complexObject;
	}

}
