package com.designpattern.factorymethod.basic.transportexample;

import com.designpattern.model.logictistransport.ITransport;
import com.designpattern.model.logictistransport.Truck;

public class TruckCreator extends Creator {

	@Override
	public ITransport createTransport() {
		// TODO Auto-generated method stub
		return new Truck();
	}
	
}
