package com.yjs.domain;

public class RocketLiftOff implements Runnable{

	private int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	private Object lock = new Object();
	
	public RocketLiftOff() {
	}
	
	public RocketLiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String displayStatus() {		
		return String.format("#%d ( %s)", id, (countDown > 0 ? countDown : " Lift Off!"));
	}

	@Override
	public void run() {
		while(countDown-- > 0) {
			System.out.println(displayStatus());
		}
	}
}
