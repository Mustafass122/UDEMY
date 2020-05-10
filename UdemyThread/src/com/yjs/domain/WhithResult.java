package com.yjs.domain;

import java.util.concurrent.Callable;

public class WhithResult implements Callable<String>{

	private int id;
	
	public WhithResult(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "Result of WithResult : " + id ; 
	}
	
}
