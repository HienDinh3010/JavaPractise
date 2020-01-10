package com.designpattern.state;

public class Context {
	private IState state;

	public Context(IState state) {
		super();
		this.state = state;
	}
	
	public String operation() {
		return "Operation of the current state " + state.operation(this);
	}

	public void setState(IState state) {
		this.state = state;
	}	
}
