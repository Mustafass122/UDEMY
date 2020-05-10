package com.yjs.program;

import com.yjs.domain.CustomThread;

public class DriverCustomThread {

	public static void main(String[] args) {
		
		CustomThread thread = new CustomThread();
		thread.start();
	}
}
