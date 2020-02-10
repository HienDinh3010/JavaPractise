package com.example.Concurrency;

public class HelloThread extends Thread implements Runnable {

	public static void main(String[] args) {
		(new HelloThread()).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
	
}
