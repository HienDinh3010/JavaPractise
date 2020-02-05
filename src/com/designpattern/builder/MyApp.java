package com.designpattern.builder;

public class MyApp {

	public static void main(String[] args) {
		Director director = new Director(new Builder1());
		System.out.println(director.contruct());
		
		director = new Director(new AnotherBuilder());
		System.out.println(director.contruct());
	}

}
