package com.udemy.yurtdisi;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{

	private int harc;
	private boolean siyasi_yasak;
	private boolean vize_durumu;
	
	public Yolcu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Harç Bedelinizi Giriniz : ");
		this.harc = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Siyasi Yasağınız Bulunuyor mu? (Evet/Hayır) :");
		String siyasi_cevap = scanner.nextLine();
		
		if (siyasi_cevap.equals("Evet")) {
			this.siyasi_yasak = true;
		}
		else {
			this.siyasi_yasak = false;
		}		
		
		System.out.println("Vizeniz Var mı? (Evet/Hayır) : ");
		String vize_cevap = scanner.nextLine();
		
		if (vize_cevap.equals("Evet")) {
			this.vize_durumu =true;
		}
		else {
			this.vize_durumu = false;
		}
	}

	@Override
	public boolean harcKontrol() {
		if (this.harc < 15) {			
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean siyasiYasakKontrol() {
		if (siyasi_yasak == true) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean vizeDurumuKontrol() {
		if (vize_durumu == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
