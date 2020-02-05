package com.designpattern.builder;

public interface IBuilder {
	void buildPartA();
	void buildPartB();
	ComplexObject getResult();
}
