package com.yjs.program;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yjs.domain.RocketLiftOff;

public class DriverCachedThreadPoolMore {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 5; i++) {
			service.execute(new RocketLiftOff());
		}
		service.shutdown();
	}
}
