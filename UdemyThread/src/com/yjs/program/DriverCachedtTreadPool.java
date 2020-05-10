package com.yjs.program;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yjs.domain.RocketLiftOff;

public class DriverCachedtTreadPool {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(new RocketLiftOff());
		service.shutdown();
	}
}
