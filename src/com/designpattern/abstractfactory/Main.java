package com.designpattern.abstractfactory;

public class Main {

	public static void main(String[] args) {
		Client client = new Client(new Factory1());
		System.out.println(client.operation());
	}
}
