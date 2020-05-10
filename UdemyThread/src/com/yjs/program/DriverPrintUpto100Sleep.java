package com.yjs.program;

import com.yjs.domain.Printupto100Sleep;

public class DriverPrintUpto100Sleep {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Printupto100Sleep());
		thread.start();
	}
}
