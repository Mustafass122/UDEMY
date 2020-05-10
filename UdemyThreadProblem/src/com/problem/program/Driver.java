package com.problem.program;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.problem.action.DepositAction;
import com.problem.domain.Account;
import com.problem.domain.AccountWithLock;

public class Driver {

	private static Account account = new Account();
	private static AccountWithLock accountWithLock = new AccountWithLock();
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		
		for (int i = 0; i < 5; i++) {
			service.execute(new DepositAction(account));
		}
		service.shutdown();
		
		while(!service.isTerminated()) {}
		System.out.println("Bakiye : " + account.getBakiye());
		
		
//		for (int i = 0; i < 5; i++) {
//			service.execute(new DepositAction(accountWithLock));
//		}
//		service.shutdown();
//		
//		while(!service.isTerminated()) {}
//		System.out.println("Bakiye : " + accountWithLock.getBakiye());
	}
}


