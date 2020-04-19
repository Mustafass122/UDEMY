package com.atm.udemy;

public class Main {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		Hesap hesap = new Hesap("Mustafa", "123", 2000);
		
		atm.calis(hesap);
		System.out.println("Sistemden Çıkılıyor..");
	}
}
