import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> dizi = new LinkedList<String>();
		elemanEkle(dizi);
		listeyiYazdir(dizi);
	}
	public static void elemanEkle(LinkedList<String> a) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Eklelemek İstediğiniz Eleman : ");
			String eleman = scanner.nextLine();
			if (eleman.equals("q")) {
				break;
			}else {
				a.add(eleman);
			}			
		}
	}
	public static void listeyiYazdir(LinkedList<String> a) {
		ListIterator<String> iterator = a.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void sıralıEkle(LinkedList<String> a,String ekle) {
		ListIterator<String> iterator = a.listIterator();
		int deger = iterator.next().compareTo(ekle);
		
		if (deger>0) {
			a.add(iterator.previous());
			
		}
		else if (deger<0) {
			
		}else {
			
		}
	}
}
