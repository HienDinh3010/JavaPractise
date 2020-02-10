package com.example.Concurrency;

public class SimpleThread {
	
	static void threadMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.format("%s: %s%n", name, message);
	}
	
	static class MessageLoop implements Runnable {

		@Override
		public void run() {
            String importantInfo[] = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
                };
            try {
                for (String str: importantInfo) {
                	Thread.sleep(4000);
                	threadMessage(str);
                }
			} catch (InterruptedException e) {
				threadMessage("I wasn't done");
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		long patience = 1000 * 60 * 60;
		if (args.length > 0) {
			try {
				patience = Long.parseLong(args[0]) * 1000;
			} catch (NumberFormatException e) {
				System.err.println("Argument must be an integer");
				System.exit(0);
			}
		}
		
		threadMessage("Start MessageLoop thread");
		long startTime = System.currentTimeMillis();
		Thread messageLoopThread = new Thread(new MessageLoop());
		messageLoopThread.start();
		
		threadMessage("Waiting for MessageLoop thread to finish");
		while (messageLoopThread.isAlive()) {
			threadMessage("Still waiting...");
			messageLoopThread.join(1000);
			if ((System.currentTimeMillis() - startTime > patience) && messageLoopThread.isAlive()) {
				threadMessage("Tired of waiting!");
				messageLoopThread.interrupt();
				messageLoopThread.join();
			}
		}
		threadMessage("Finally!");
				
	}

}
