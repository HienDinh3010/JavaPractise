package com.designpattern.strategy.problem;

/**
 * Problem: 
 * - If requirement for algorithm is changed => change algorithm => complex algorithm => complex Context class
 * - Need to have condition statement if we want to switch bw different algorithms at run-time
 * - Algorithm is implement directly in class
 * @author dnmhi
 *
 */
public class Context {

	public static void main(String[] args) {
		int condition = 1;
		int value = 0;
		switch (condition) {
		case 1:
			value = algorithm1(1);
			break;
		case 2:
			value = algorithm2(1);
			break;
		default:
			break;
		}
		System.out.println("Context:Cannot change algorithm => result = " +value);
	}
	
	public static int algorithm1(int input) {
		return input * 1;
	}
	
	public static int algorithm2(int input) {
		return input * 2;
	}
}
