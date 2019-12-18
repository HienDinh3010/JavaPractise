package com.designpattern.factorymethod.basic.transportexample;

import com.designpattern.model.logictistransport.ITransport;

public abstract class Creator {
	
	private ITransport transport;
	
	public abstract ITransport createTransport();
	
	public String operator() {
		transport = createTransport();
		return "Create a transport by " + transport.getTransportMethod();
	}
	
}
