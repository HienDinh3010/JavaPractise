package com.designpattern.factorymethod.basic;

public class Main {

	public static void main(String[] args) {
		Creator creator = new ToyCreator();
		System.out.println(creator.operator());
		Creator creator2 = new LaptopCreator();
		System.out.println(creator2.operator());
	}

}
