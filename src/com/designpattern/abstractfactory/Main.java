package com.designpattern.abstractfactory;

/**
 * @author Hien
 * Requirement: 
 * - A client needs to buy a group of products which is type 1 of each product family
 * 		+ product A1 (belongs to family product A) 
 * 		+ product B1 (belongs to family product B)
 * - Another client needs to buy different group of products which is type 2 of each product family
 * 		+ product A2 
 * 		+ product B2
 * - Another client needs to buy different group of products which is some of type 1, some of type 2 in each product family
 * 		+ product A1
 * 		+ product B2
 * 
 * Basic method: Create 3 different client class in each class we create correspondent products as above.
 * 
 * Abstract factory method: 
 * - Create a unique Client class which required creating object interface IProductA & IProductB
 * - Create three factory classes based on client request for buying products.
 * 
 * Abstract factory will solved problems:
 * - Do not create object directly in Client but delegate create object for factory
 * - A client can create many different group of products by create correspondent factory.
 * 
 * Not good:
 * - If client need more type of product family(for example, IProductC) then we should add this IProductC to Client
 *   If another client does not need this IProductC then should set it to null
 * 
 */
public class Main {

	public static void main(String[] args) {
		Client client = new Client(new Factory1());
		System.out.println(client.operation());
	}
}
