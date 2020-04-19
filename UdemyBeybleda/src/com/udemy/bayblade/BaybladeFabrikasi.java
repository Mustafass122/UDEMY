package com.udemy.bayblade;

public class BaybladeFabrikasi {

	public static Bayblade baybladeUret(String bayblade_turu) {
		Bayblade bayblade = new Bayblade();
		
		if (bayblade_turu.equals("Dragon")) {
			Bayblade dragon = new Dragon("Takao", "5000", "400", "Takaonun Kutsal canavarı", "Takaonun Gizli Yeteneği");
			bayblade = dragon;
		}
		else if (bayblade_turu.contentEquals("Dranza")) {
			Bayblade dranza = new Dranza("Kai", "700", "1000", "Kainin Kutsal Canavarı");
			bayblade = dranza;
		}
		else if (bayblade_turu.equals("Drayga")) {
			Bayblade drayga = new Drayga("Rei", "4587", "87100000", "Reinin Kutsal Canavarı");
			bayblade = drayga;
		}
		else if (bayblade_turu.equals("Draciel")) {
			Bayblade draciel = new Draciel("Max", "78888888888", "9591481817", "Maxın Kutsal Canavarı");
			bayblade = draciel;
		}
		else {
			System.out.println("Hatalı İşlem");
		}
		return bayblade;
	}
}
