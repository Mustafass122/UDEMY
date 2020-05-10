package com.yjs.program;

import com.yjs.domain.PrintUpto100Join;

public class DriverPrintUpto100Join {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new PrintUpto100Join());
		thread.start();
	}
}
