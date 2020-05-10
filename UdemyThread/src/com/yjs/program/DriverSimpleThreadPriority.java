package com.yjs.program;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yjs.domain.SimpleThreadPriorty;

public class DriverSimpleThreadPriority {

	public static void main(String[] args) {
	
		ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service2 = Executors.newFixedThreadPool(1);
		
		for (int i = 0; i < 5; i++) {
			service.execute(new SimpleThreadPriorty(Thread.MIN_PRIORITY));
		}
		service.execute(new SimpleThreadPriorty(Thread.MAX_PRIORITY));
		
		service.shutdown();
	}
}
