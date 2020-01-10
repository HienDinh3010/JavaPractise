package com.designprinciple.liskovsubstitution;

public class Main {

	public static void main(String[] args) {
		PostHandler postHandler = new PostHandler();
		postHandler.handlePost();
	}

}
