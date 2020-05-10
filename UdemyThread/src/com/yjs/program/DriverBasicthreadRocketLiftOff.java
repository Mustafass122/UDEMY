package com.yjs.program;

import com.yjs.domain.RocketLiftOff;

public class DriverBasicthreadRocketLiftOff {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new RocketLiftOff());
		thread.start();
		
		System.out.println("Main Thread Cont.");
	}
}
