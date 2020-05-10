package com.driver.first;

public class ThreadSleeper {

	public static void sleep(long milliseconds) {
		
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
