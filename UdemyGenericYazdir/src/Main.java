
public class Main {

	public static void main(String[] args) {
		
		Character[] characters_dizi = {'J','A','V','A'};
		String[] string_dizi = {"Mustafa","Sabit","Sipahi"};
		Integer[] int_dizi = {1,2,3,4,5};
		Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Kadir"),new Ogrenci("Nergiz")};

		yazdir(characters_dizi);
		yazdir(string_dizi);
		yazdir(int_dizi);
		yazdir(ogrenci_dizi);
	}
	public static <E> void yazdir(E[] dizi) {
		for(E e : dizi) {
			System.out.println(e);
		}
	}
}
