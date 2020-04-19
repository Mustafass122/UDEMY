import java.util.ArrayList;

public class Sarkicilar {

	private ArrayList<String> sarkici_list = new ArrayList<String>();


	public void sarkicilariBastir() {
		for(String s : sarkici_list) {
			System.out.println(s);
		}
	}
	
	public void sarkiciEkle(String isim) {
		sarkici_list.add(isim);
		System.out.println(isim + " isimli şarkıcı eklendi.");
	}
	
	public void sarkiciGüncelle(int pozisyon,String isim) {
		sarkici_list.set(pozisyon, isim);
		System.out.println(isim+ " isimli şarkıcı " + pozisyon + " pozisyona atandı");
	}
	
	public void sarkiciSil(String isim) {
		sarkici_list.remove(isim);
	}
	
	public void sarkiciAra(String isim) {
		if (sarkici_list.contains(isim)) {
			System.out.println("Şarkıcı Listede Var");
			int poz = sarkici_list.indexOf(isim);
			System.out.println("Şarkıcı " + poz + " pozisyonda");
		}
		else {
			System.out.println("Şarkıcı Listede Bulunmuyor.");
		}
	}
}

