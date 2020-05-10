package com.yjs.program;

import com.yjs.domain.CustomThread;

public class DriverBasicCustomthread {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			CustomThread thread = new CustomThread();
			thread.start();
		}
	}
}
