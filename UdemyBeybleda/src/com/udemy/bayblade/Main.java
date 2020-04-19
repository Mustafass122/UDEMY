package com.udemy.bayblade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("Bayblade Programına Hoşgeldiniz....");
		System.out.println("*************************");
		
		System.out.println("Çıkış İçin q ya Basınız : ");
		
		while(true) {
			System.out.println("Hangi Beyblade Üretmek İstiyorsunuz : ");
			String tür = scanner.nextLine();

			if (tür.equals("q")) {
				System.out.println("Sistemden Çıkılıyor...");
				break;
			}
			else {
				Bayblade bayblade = BaybladeFabrikasi.baybladeUret(tür);
				bayblade.bilgileriGöster();
				bayblade.kulsalcanavarCikar();
				bayblade.saldir();
			}			
		}
		scanner.close();
	}
}
