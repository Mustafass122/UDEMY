package com.yjs.domain;

public class SimpleThreadPriorty implements Runnable{

	private int countDown = 5;
	private volatile double data;
	private int priority;
	
	public SimpleThreadPriorty(int priority) {
		this.priority = priority;
	}

	@Override
	public void run() {
		Thread.currentThread().setPriority(priority);
		
		while(true) {
			for (int i = 0; i < 100; i++) {
				data += (Math.PI + Math.E);
				if (i % 10 == 0) {
					Thread.yield();
				}
			}
			System.out.println(this);
			if(--countDown == 0) return;
		}		
	}

	@Override
	public String toString() {
		return String.format("%s : %d", Thread.currentThread(),countDown);
	}	
}
