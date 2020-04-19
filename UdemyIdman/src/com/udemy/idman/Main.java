package com.udemy.idman;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("************");
		System.out.println("İdman Programına Hoşgeldiniz..");
		System.out.println("************");
		
		System.out.print("Lütfen Hedef Burpee Sayısını Giriniz : ");
		int hedefburpee = scanner.nextInt();
		System.out.print("Lütfen Hedef Pushup Sayısını Giriniz : ");
		int hedefpushup = scanner.nextInt();
		System.out.print("Lütfen Hedef Situp Sayısını Giriniz : ");
		int hedefsitup = scanner.nextInt();
		System.out.print("Lütfen Hedef Squat Sayısını Giriniz : ");
		int hedefsquat = scanner.nextInt();
		scanner.nextLine();
		
		Idman idman = new Idman(hedefburpee, hedefpushup, hedefsitup, hedefsquat);
		
		String hareketler = "Burpee\n"
							+"Pushup\n"
							+ "Situp\n"
							+ "Squat";
		
		while(idman.hareketBittimi() == false) {
			System.out.println(hareketler);
			System.out.print("Yapmak İstediğiniz Hareket Türünü Giriniz : ");
			String harekettur = scanner.nextLine();
			System.out.print("Yapmak İstediğiniz Miktarı Giriniz : ");
			int miktar = scanner.nextInt();
			scanner.nextLine();
			
			if (harekettur.equals("Burpee")) {
				idman.burpeeYap(miktar);
			}
			else if (harekettur.equals("Pushup")) {
				idman.pushupYap(miktar);
			}
			else if (harekettur.equals("Situp")) {
				idman.situpYap(miktar);
			}
			else if (harekettur.equals("Squat")) {
				idman.squatYap(miktar);
			}
			else {
				System.out.println("Hatalı İşlem..");
			}
		}
		System.out.println("İdmanınızı Başarıyla Tamamladınız..");
	}
}
