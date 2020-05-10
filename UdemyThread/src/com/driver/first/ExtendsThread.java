package com.driver.first;

public class ExtendsThread extends Thread {

	@Override
	public void run() {		
		String threadName = Thread.currentThread().getName();
		System.out.println("My name is : " + threadName + " I am started");
		
		int total = 0;
		for (int i = 0; i < 1000; i++) {
			total += i;
		}
		System.out.println("Tatal : " + total);
	}

	
}
