package com.driver.first;

public class ImplementsRunnable implements Runnable{

	@Override
	public void run() {
		
		String threadName = Thread.currentThread().getName();
		System.out.println("My name is : " + threadName + " I am started");
		
		int total = 0;
		for (int i = 0; i < 5; i++) {
			total +=i;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Total : " + total);
	}

}
