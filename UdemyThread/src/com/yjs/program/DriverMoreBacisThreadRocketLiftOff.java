package com.yjs.program;

import com.yjs.domain.RocketLiftOff;

public class DriverMoreBacisThreadRocketLiftOff {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Thread(new RocketLiftOff()).start();
		}
	}
}
