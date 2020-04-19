package com.udemy.calisanlar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("**********************");
		System.out.println("Çalışanlar Proramına Hoşgeldiniz..");
		System.out.println("**********************");
		
		String islemler = "1.Yazılımcı İşlemleri\n"
						  + "2.Yönetici İşlemleri\n"
						  +"Çıkış İçin q ya Basınız";
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(islemler);
			System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
			String islem = scanner.nextLine();
			if (islem.equals("1")) {
				Yazilimci yazilimci = new Yazilimci("Mustafa Sabit", "Sipahi", "123456", "Jave ve Python");
				System.out.println("Yazilimic İşlemleri : ");
				String yaz_islemler = "1.Format At\n"
									+"2.Bilgileri Göster\n"
									+ "Çıkış İçin q ya basınız";
				while(true) {
					System.out.println(yaz_islemler);
					System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
					String yaz_islem = scanner.nextLine();
					if (yaz_islem.equals("1")) {
						System.out.println("Lütfen Format Atmak İstediğiniz İşletim Sistemini Giriniz : ");
						String is_sistem = scanner.nextLine();
						yazilimci.formatAt(is_sistem);
					}
					else if (yaz_islem.equals("2")) {
						yazilimci.bilgileriGöster();
					}
					else if (yaz_islem.equals("q")) {
						System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
						break;
					}
					else {
						System.out.println("Geçersiz İşlem.");
					}
				}
			}
			else if (islem.equals("2")) {
				Yönetici yönetici = new Yönetici("Abdulkadir", "Sipahi", "78945", 750);
				System.out.println("Yönetici İşlemleri : ");
				String yön_islemler = "1.Zam Yap\n"
									+"2.Bilgileri Göster\n"
									+ "Çıkış İçin q ya basınız";
				while(true) {
					System.out.println(yön_islemler);
					System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
					String yön_islem = scanner.nextLine();
					if (yön_islem.equals("1")) {
						System.out.println("Lütfen Zam Miktarını Giriniz : ");
						int zam_miktar = scanner.nextInt();
						scanner.nextLine();
						yönetici.zamYap(zam_miktar);
					}
					else if (yön_islem.equals("2")) {
						yönetici.bilgileriGöster();
					}
					else if (yön_islem.equals("q")) {
						System.out.println("Yönetici İşlemlerinden Çıkılıyor..");
						break;
					}
					else {
						System.out.println("Geçersiz İşlem.");
					}
				}
			}
			else if (islem.equals("q")) {
				System.out.println("Programdan Çıkılıyor...");
				break;
			}
			else {
				System.out.println("Geçersiz İşlem.");
			}
		}		
		
	}
}
