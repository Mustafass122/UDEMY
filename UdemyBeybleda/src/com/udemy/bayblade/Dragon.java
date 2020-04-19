package com.udemy.bayblade;

public class Dragon extends Bayblade {

	private String kursal_canavar;
	private String gizli_yetenek;

	public Dragon(String bayblade_ismi, String dönüs_hizi, String saldiri_gücü, String kursal_canavar,String gizli_yetenek) {
		super(bayblade_ismi, dönüs_hizi, saldiri_gücü);
		this.kursal_canavar = kursal_canavar;
		this.gizli_yetenek = gizli_yetenek;
	}

	@Override
	public void kulsalcanavarCikar() {
		System.out.println(getBayblade_ismi() + " " + " Dragon Kutsal Canavarı");
		System.out.println(getBayblade_ismi() + " ın saldırısı : Hayalet Kasırga");
	}

	@Override
	public void bilgileriGöster() {
		super.bilgileriGöster();
		System.out.println("Kutsal Canavar : " + kursal_canavar);
		System.out.println(getBayblade_ismi() + " nin gizli yeteneği : " + gizli_yetenek);
	}
	
}
