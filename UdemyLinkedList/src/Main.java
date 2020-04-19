import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> gidilecek_yerler = new LinkedList<String>();
		gidilecek_yerler.add("Antalya");
		gidilecek_yerler.add("Ankara");
		gidilecek_yerler.add("İstanbul");
		gidilecek_yerler.add("Kıbrıs");
		listeyiBastir(gidilecek_yerler);	
		
		for(String s : gidilecek_yerler) {
			System.out.println(s);
		}
	}
	public static void listeyiBastir(LinkedList<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
