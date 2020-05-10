package com.yjs.program;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yjs.domain.Printupto100Sleep;

public class DriverFixedThreadPool {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			service.execute(new Printupto100Sleep());
		}
		System.out.println("Main thread Cont.");
		
		service.shutdown();
	}
}
