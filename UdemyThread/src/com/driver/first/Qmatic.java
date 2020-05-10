package com.driver.first;

public class Qmatic implements Runnable{

	private Object lOCK = new Object();
	private volatile int orderNo = 0; // Kritik değerlere volatile veririz. Sürekli CPU ya gitmemesi için

	
	@Override
	public synchronized void run() {		
		synchronized (lOCK) {
			this.orderNo = this.orderNo + 1;
			
			StringBuilder builder = new StringBuilder();
			builder.append(Thread.currentThread().getName());
			builder.append(" threat got ");
			builder.append(this.orderNo);
			builder.append(" from Qmatic");
			
			System.out.println(builder.toString());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

}
