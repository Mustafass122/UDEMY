package com.problem.action;

import com.problem.domain.Account;

public class DepositAction implements Runnable{

	private Account account;
	
	public DepositAction(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.paraYatir(1);
	}
}
