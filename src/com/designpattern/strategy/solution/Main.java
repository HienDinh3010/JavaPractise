package com.designpattern.strategy.solution;

public class Main {

	public static void main(String[] args) {
		Context context = new Context(new Strategy1());
		System.out.println(context.operator());
		
		//Change strategry
		context.setStragery(new Strategy2());
		System.out.println(context.operator());

	}

}
