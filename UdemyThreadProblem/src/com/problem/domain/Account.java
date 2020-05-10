package com.problem.domain;

public class Account {

	private int bakiye = 0;

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	
	public void paraCek(int miktar) {
		throw new UnsupportedOperationException();
	}
	
	public synchronized void paraYatir(int miktar) {
		
		int yeniBakiye = bakiye + miktar;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		bakiye = yeniBakiye;
	}
}
