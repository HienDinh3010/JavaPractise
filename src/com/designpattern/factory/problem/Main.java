package com.designpattern.factory.problem;

/**
 * @author dnmhi
 * Problem:
 * - Need to create different creator with same operator but different product type
 * => Need to modify two operators in creators
 */
public class Main {

	public static void main(String[] args) {
		Creator creator = new Creator();
		System.out.println(creator.operator());
		Creator2 creator2 = new Creator2();
		System.out.println(creator2.operator());
	}

}
