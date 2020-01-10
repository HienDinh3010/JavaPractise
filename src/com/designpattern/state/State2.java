package com.designpattern.state;

public class State2 implements IState {
	
	private static final State2 instance = new State2();	

	public State2() {

	}

	public static State2 getInstance() {
		return instance;
	}

	@Override
	public String operation(Context context) {
		String result = "State 2 do something. Finished. Switch to state 1";
		context.setState(State1.getInstance());
		return result;
	}

}
