package com.yjs.domain;

public class PrintChar implements Runnable {

	private char character;
	private int times;
	
	public PrintChar(char character,int times) {
		this.character = character;
		this.times= times;
	}
	
	public void printCharacter() {
		System.out.print(character + " - ");
	}
	
	@Override
	public void run() {
		int i = 0;
		while(i++ < times) {
			printCharacter();
			if(i > 10)
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	
}
