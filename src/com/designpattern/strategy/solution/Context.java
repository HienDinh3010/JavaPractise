package com.designpattern.strategy.solution;

public class Context {

	private IStragery stragery;

	public Context(IStragery stragery) {
		super();
		this.stragery = stragery;
	}

	public void setStragery(IStragery stragery) {
		this.stragery = stragery;
	}
	
	public String operator() {
		return "Context: Delegating algorithm to a strategry => result = " + stragery.algorithm(1); 
	}
}
