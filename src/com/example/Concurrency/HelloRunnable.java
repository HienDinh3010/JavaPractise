package com.example.Concurrency;

public class HelloRunnable implements Runnable {

	public static void main(String[] args) {
		//(new HelloRunnable()).run();
		(new Thread(new HelloRunnable())).start();
	}

	@Override
	public void run() {
		System.out.println("Hello from a Thread");
	}

}
