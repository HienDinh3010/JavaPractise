package com.designpattern.builder;

import com.designpattern.builder.model.ProductA2;
import com.designpattern.builder.model.ProductB5;

public class AnotherBuilder implements IBuilder {

	private ComplexObject complexObject = new ComplexObject();
	
	@Override
	public void buildPartA() {
		System.out.println("AnotherBuilder: Creating & assembling ProductA2");
		complexObject.add(new ProductA2());
	}

	@Override
	public void buildPartB() {
		System.out.println("AnotherBuilder: Creating & assembling ProductB5");
		complexObject.add(new ProductB5());
	}

	@Override
	public ComplexObject getResult() {
		// TODO Auto-generated method stub
		return complexObject;
	}

}
