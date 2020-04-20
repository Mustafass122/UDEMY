package com.udemy.calisanlar;

public class Yönetici extends Calisan{

	private int sorumlu_kisisayisi;

	public Yönetici(String ad, String soyad, String id, int sorumlu_kisisayisi) {
		super(ad, soyad, id);
		this.sorumlu_kisisayisi = sorumlu_kisisayisi;
	}
	
	public void zamYap(int miktar) {
		System.out.println(getAd() + " " + miktar + " kadar zam yapıyor..");
	}

	@Override
	public void bilgileriGöster() {
		super.bilgileriGöster();
		System.out.println("Sorumlu Kişi Sayısı : " + sorumlu_kisisayisi);
	}
	
}
