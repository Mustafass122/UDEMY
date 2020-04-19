package com.udemy.bayblade;

public class Dranza extends Bayblade{

	private String kutsal_canavar;

	public Dranza(String bayblade_ismi, String dönüs_hizi, String saldiri_gücü, String kutsal_canavar) {
		super(bayblade_ismi, dönüs_hizi, saldiri_gücü);
		this.kutsal_canavar = kutsal_canavar;
	}

	@Override
	public void kulsalcanavarCikar() {
		System.out.println(getBayblade_ismi() + " " + " Dranza Kutsal Canavarı");
		System.out.println(getBayblade_ismi() + " ın saldırısı : Alev Kılıcı");
	}

	@Override
	public void bilgileriGöster() {
		super.bilgileriGöster();
		System.out.println("Kutsal Canavar : " + kutsal_canavar);
	}
	
	
}
