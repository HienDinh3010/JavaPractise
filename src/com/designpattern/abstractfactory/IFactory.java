package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.model.IProductA;
import com.designpattern.abstractfactory.model.IProductB;

public interface IFactory {
	IProductA createProductA();
	IProductB createProductB();
}
