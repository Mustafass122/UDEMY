package com.udemy.idman;

public class Idman {

	private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;
    
	public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
		this.burpee_sayisi = burpee_sayisi;
		this.pushup_sayisi = pushup_sayisi;
		this.situp_sayisi = situp_sayisi;
		this.squat_sayisi = squat_sayisi;
	}

	public int getBurpee_sayisi() {
		return burpee_sayisi;
	}

	public void setBurpee_sayisi(int burpee_sayisi) {
		this.burpee_sayisi = burpee_sayisi;
	}

	public int getPushup_sayisi() {
		return pushup_sayisi;
	}

	public void setPushup_sayisi(int pushup_sayisi) {
		this.pushup_sayisi = pushup_sayisi;
	}

	public int getSitup_sayisi() {
		return situp_sayisi;
	}

	public void setSitup_sayisi(int situp_sayisi) {
		this.situp_sayisi = situp_sayisi;
	}

	public int getSquat_sayisi() {
		return squat_sayisi;
	}

	public void setSquat_sayisi(int squat_sayisi) {
		this.squat_sayisi = squat_sayisi;
	}
	
    public void hareketYap(String hareketTuru,int sayi) {
    	
    	if (hareketTuru.equals("Burpee")) {
			burpeeYap(sayi);
		}
    	else if (hareketTuru.equals("Pushup")) {
    		pushupYap(sayi);
		}
    	else if (hareketTuru.equals("Situp")) {
    		situpYap(sayi);
		}
    	else if (hareketTuru.equals("Squat")) {
    		squatYap(sayi);
		}
    	else {
			System.out.println("Geçersiz Hareket.");
		}
    }
    public void burpeeYap(int sayi) {
    	if (burpee_sayisi == 0) {
			System.out.println("Yapacak Burpee Kalmadı.");
		}
    	if (burpee_sayisi < sayi) {
			System.out.println("HEdeflediğin Burpee Sayısına Ulaştınız.");
			burpee_sayisi = 0;
			System.out.println("Burpee Sayısı : " + burpee_sayisi);
		}
    	else {
    		burpee_sayisi -= sayi;
			System.out.println("Kalan Burpee Sayısı : " + burpee_sayisi);
		}
    }
    public void pushupYap(int sayi) {
    	if (pushup_sayisi == 0) {
			System.out.println("Yapacak Pushup Kalmadı.");
		}
    	if (pushup_sayisi < sayi) {
			System.out.println("HEdeflediğin Pushup Sayısına Ulaştınız.");
			pushup_sayisi = 0;
			System.out.println("Pushup Sayısı : " + pushup_sayisi);
		}
    	else {
    		pushup_sayisi -= sayi;
			System.out.println("Kalan Pushup Sayısı : " + pushup_sayisi);
		}
    }
    public void situpYap(int sayi) {
    	if (situp_sayisi == 0) {
			System.out.println("Yapacak Situp Kalmadı.");
		}
    	if (situp_sayisi < sayi) {
			System.out.println("HEdeflediğin Situp Sayısına Ulaştınız.");
			situp_sayisi = 0;
			System.out.println("Situp Sayısı : " + situp_sayisi);
		}
    	else {
    		situp_sayisi -= sayi;
			System.out.println("Kalan Situp Sayısı : " + situp_sayisi);
		}
    }
    public void squatYap(int sayi) {
    	if (squat_sayisi == 0) {
			System.out.println("Yapacak Squat Kalmadı.");
		}
    	if (squat_sayisi < sayi) {
			System.out.println("HEdeflediğin Squat Sayısına Ulaştınız.");
			squat_sayisi = 0;
			System.out.println("Squat Sayısı : " + squat_sayisi);
		}
    	else {
    		squat_sayisi -= sayi;
			System.out.println("Kalan Squat Sayısı : " + squat_sayisi);
		}
    }
    public boolean hareketBittimi() {
    	boolean sonuc = false;
    	if ((burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0)){
			sonuc= true;
		}
    	return sonuc;
    }
}
