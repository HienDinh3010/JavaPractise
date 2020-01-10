package com.designpattern.state;

public class Main {

	public static void main(String[] args) {
		Context context = new Context(State1.getInstance());
		System.out.println("(1)" + context.operation());
		System.out.println("(2)"+context.operation());
	}

}
