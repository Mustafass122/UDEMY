package com.driver.first;

public class ImplementsRunnable2 implements Runnable{

	private boolean live = true;
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("My Nam is : " + threadName + " I am started");
		
		int total = 0;
		while(live) {
			total += 1;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Total : " + total);
	}
	public void stop() {
		live = false;
	}

}
