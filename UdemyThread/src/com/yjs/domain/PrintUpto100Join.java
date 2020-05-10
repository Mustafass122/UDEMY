package com.yjs.domain;

public class PrintUpto100Join implements Runnable{

	private static final int LIMIT = 100;

	@Override
	public void run() {
		
		Thread thread = new Thread(new PrintChar('A', 20));
		thread.start();
		
		int i = 0;
		while(i++ < LIMIT) {
			System.out.println(i);
			if(i == 60)
				try {
					thread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	
	
	
	
}
