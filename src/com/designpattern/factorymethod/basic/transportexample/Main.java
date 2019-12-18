package com.designpattern.factorymethod.basic.transportexample;

public class Main {

	public static void main(String[] args) {
		ShipCreator shipCreator = new ShipCreator();
		System.out.println(shipCreator.operator());
		
		TruckCreator truckCreator = new TruckCreator();
		System.out.println(truckCreator.operator());
	}

}
