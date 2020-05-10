package com.problem.domain;

public class AccountWithLock extends Account {

	private static Object LOCK = new Object();

	@Override
	public void paraCek(int miktar) {
		int yeniBakiye = getBakiye() + miktar;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setBakiye(yeniBakiye);
	}
	
	
}
