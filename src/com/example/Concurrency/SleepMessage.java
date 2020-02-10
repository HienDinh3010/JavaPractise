package com.example.Concurrency;

public class SleepMessage {

	public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };
        for (String str: importantInfo) {
        	Thread.sleep(4000);
        	System.out.println(str);
        }
	}
}
