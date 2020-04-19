
public class Main {

	public static void main(String[] args) {
		
		Sarkicilar sarkicilar = new Sarkicilar();
		sarkicilar.sarkiciEkle("Mustafa");
		sarkicilar.sarkiciEkle("Kadir");
		sarkicilar.sarkiciEkle("Galip");
		sarkicilar.sarkiciEkle("Hümeyra");
		sarkicilar.sarkiciEkle("Fatma");
		
		System.out.println("*********************************");
		sarkicilar.sarkicilariBastir();
		System.out.println("*********************************");
		sarkicilar.sarkiciEkle("Nergiz");
		sarkicilar.sarkiciEkle("Şevket");
		System.out.println("*********************************");
		sarkicilar.sarkicilariBastir();
		System.out.println("*********************************");
		sarkicilar.sarkiciAra("Mustafa");
		System.out.println("*********************************");
		sarkicilar.sarkiciGüncelle(3, "Derya");
		System.out.println("*********************************");
		sarkicilar.sarkicilariBastir();
		System.out.println("*********************************");
		sarkicilar.sarkiciSil("Mustafa");
		System.out.println("*********************************");
		sarkicilar.sarkicilariBastir();
		System.out.println("*********************************");
	}
}
