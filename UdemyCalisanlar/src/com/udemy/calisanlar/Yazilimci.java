package com.udemy.calisanlar;

public class Yazilimci extends Calisan{

	private String diller;
	
	public Yazilimci(String ad, String soyad, String id,String diller) {
		super(ad, soyad, id);
		this.diller = diller;
	}
	public void formatAt(String is_sistemi) {
		System.out.println("Format Atılıyor....");
		System.out.println(getAd() +" "+ is_sistemi + " ni yüklüyor");
	}
	@Override
	public void bilgileriGöster() {
		super.bilgileriGöster();
		System.out.println("Yazılımcının Bildiği Diller : " + diller);
	}	
}
