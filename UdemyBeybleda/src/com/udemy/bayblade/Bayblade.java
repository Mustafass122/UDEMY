package com.udemy.bayblade;

public class Bayblade {

	private String bayblade_ismi;
	private String dönüs_hizi;
	private String saldiri_gücü;
	
	public Bayblade() {
		System.out.println("Boş Bayblade");
	}
	
	public Bayblade(String bayblade_ismi, String dönüs_hizi, String saldiri_gücü) {
		this.bayblade_ismi = bayblade_ismi;
		this.dönüs_hizi = dönüs_hizi;
		this.saldiri_gücü = saldiri_gücü;
	}

	public String getBayblade_ismi() {
		return bayblade_ismi;
	}

	public void setBayblade_ismi(String bayblade_ismi) {
		this.bayblade_ismi = bayblade_ismi;
	}

	public String getDönüs_hizi() {
		return dönüs_hizi;
	}

	public void setDönüs_hizi(String dönüs_hizi) {
		this.dönüs_hizi = dönüs_hizi;
	}

	public String getSaldiri_gücü() {
		return saldiri_gücü;
	}

	public void setSaldiri_gücü(String saldiri_gücü) {
		this.saldiri_gücü = saldiri_gücü;
	}
	
	public void saldir() {
		System.out.println(getBayblade_ismi() + " " + saldiri_gücü + " ve " + dönüs_hizi + " ile saldırmaktadır.");
	}
	
	public void kulsalcanavarCikar() {
		System.out.println(getBayblade_ismi() + " " + " kutsal canavarı bulunmuyor.");
	}
	
	public void bilgileriGöster() {
		System.out.println("İsmi : " + getBayblade_ismi());
		System.out.println("Döüş Hızı : " + dönüs_hizi);
		System.out.println("Saldırı Gücü : " + saldiri_gücü);
	}
}
