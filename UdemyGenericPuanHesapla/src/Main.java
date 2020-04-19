
public class Main {

	public static void main(String[] args) {

		Sayisal s1 = new Sayisal(10, 20, 30, 40, "Mustafa");
		Sayisal s2 = new Sayisal(15, 25, 35, 45, "Mehmet");
		Sayisal s3 = new Sayisal(20, 30, 40, 50, "Deniz");
		Sayisal saybir = birinci(s1, s2, s3);
		System.out.println("Sayısal Birincisi : " + saybir.getIsim()+ " dir. Puanı : " + saybir.puanHesapla());
		
		Sozel so1 = new Sozel(5, 10, 15, 20, "Kadir");
		Sozel so2 = new Sozel(3, 5, 7, 9, "İlhan");
		Sozel so3 = new Sozel(45, 26, 14, 27, "Yüksel");
		Sozel sozbir = birinci(so1, so2, so3);
		System.out.println("Sözel Birincisi : " + sozbir.getIsim() + " dir. Puanı : " + sozbir.puanHesapla());
		
	}	
	public static <E extends Aday> E birinci(E e1,E e2,E e3) {
		if (e1.puanHesapla()>e2.puanHesapla() && e1.puanHesapla()>e3.puanHesapla()) {
			return e1;
		}
		else if (e2.puanHesapla()>e1.puanHesapla() && e2.puanHesapla()>e3.puanHesapla()) {
			return e2;
		}
		else {
			return e3;
		}
	}
}
