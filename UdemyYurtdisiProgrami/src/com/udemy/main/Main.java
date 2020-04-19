package com.udemy.main;

import com.udemy.yurtdisi.Yolcu;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("***************************************");
		System.out.println("YurtDışı Çıkış Programına Hoşgeldiniz..");
		System.out.println("***************************************");
		
		
		String sartlar = "Yurt Dışına Çıkabilmek İçin Bütün Şartları Sağlamalısınız.\n";
		
		while(true) {
			System.out.println(sartlar);
			Yolcu yolcu = new Yolcu();
			
			System.out.println("Harc Bedeli Sorgulanıyor.Lütfen Bekleyiniz...");
			Thread.sleep(2000);
			
			if (yolcu.harcKontrol() == false) {
				System.out.println("Lütfen Harç Bedelini Tam Yatırınız..");
				continue;
			}
			else {
				System.out.println("Harç Bedeli Tamam.");
				Thread.sleep(1000);
			}
			System.out.println("Siyasi Yasak Durumunuz Sorgulanıyor.Lütfen Bekleyiniz..");
			Thread.sleep(2000);
			
			if (yolcu.siyasiYasakKontrol() == true) {
				System.out.println("Siyasi Yasağınız Bulunuyor.Yurt Dışına Çıkamazsınız..");
				continue;
			}
			else {
				System.out.println("Siyasi Yasağınız Yok.");
				Thread.sleep(1000);
			}
			
			System.out.println("Vize Durumunuz Kontrol Ediliyor.Lütfen Bekleyiniz...");
			Thread.sleep(2000);
			
			if (yolcu.vizeDurumuKontrol() == false) {
				System.out.println("Vizeniz Yok.Yurt Dışına Çıkamazsınız..");
				continue;
			}
			else {
				System.out.println("Vize Durumuz Tamam.");
				Thread.sleep(1000);
			}
			System.out.println("Tüm Şartları Sağladınız Yurt Dışına Çıkabilirsiniz....");
			break;
		}			
	}
}
