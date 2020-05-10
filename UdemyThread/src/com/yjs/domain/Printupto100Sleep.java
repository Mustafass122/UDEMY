package com.yjs.domain;

public class Printupto100Sleep implements Runnable{

	private static final int LIMIT = 100;

	@Override
	public void run() {
		int i = 0;
		while(i++ < LIMIT) {
			System.out.println(i);
			if(i > 60)
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	
	
}
