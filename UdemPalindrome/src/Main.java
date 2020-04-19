import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean value = true;
		while(value) {
			System.out.println("Çıkmak İçin q ya basınız");
			System.out.println("Bir Cümle Giriniz : ");
			String cumle = scanner.nextLine();
			
			if (cumle.equals("q")) {
				value = false;
			}
			else {
				polindromBul(cumle);
			}
		}
		scanner.close();		
	}
	public static void polindromBul(String cumle) {
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();
		
		for (int i = 0; i < cumle.length()/2; i++) {
			list1.add(cumle.charAt(i));
		}
		
		for (int i = cumle.length()-1; i >= cumle.length()/2; i--) {
			list2.add(cumle.charAt(i));
		}				
		int sayac = 0;
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) == list2.get(i)) {
				sayac++;
			}
		}
		if (sayac == list1.size()) {
			System.out.println("Bu Sayı Polindrom Bir Sayıdır");
		}
		else {
			System.out.println("Bu Sayı Polindrom bir Sayı Değildir");
		}
	}
}
