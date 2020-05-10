package com.yjs.domain;

public class CustomThread extends Thread {

	private static int counter = 0;
	private final int id = ++counter;
	
	@Override
	public void run() {
		System.out.println("Id : " + id);
	}
	
}
