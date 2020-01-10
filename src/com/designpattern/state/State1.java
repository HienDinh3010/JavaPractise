package com.designpattern.state;

public class State1 implements IState {
	
	private static final State1 instance = new State1();

	private State1() {
	}

	public static State1 getInstance() {
		return instance;
	}

	@Override
	public String operation(Context context) {
		String result = "State 1 do something. Finished then switch to State 2";
		context.setState(State2.getInstance());
		return result;
	}

}
