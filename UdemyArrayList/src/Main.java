import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mustafa");
		list.add("Kadir");
		list.add("Şevket");
		list.add("Nergiz");
		list.add(null);
		
		yazdir(list);
				
	}
	public static void yazdir(ArrayList<String> a) {
		for(String b : a) {
			System.out.println(b);
		}
	}
}
