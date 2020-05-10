package com.driver.first;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Qmatic qmatic = new Qmatic();
		
		for (int i = 0; i < 10; i++) {
			service.execute(qmatic);
		}
		service.shutdown();
	}
}
