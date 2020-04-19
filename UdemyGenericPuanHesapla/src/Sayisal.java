
public class Sayisal extends Aday {

	public Sayisal(int turkce, int matematik, int fizik, int edebiyat,String isim) {
		super(turkce, matematik, fizik, edebiyat,isim);
	}

	@Override
	public int puanHesapla() {
		return getMatematik()*6+getFizik()*4+getTurkce()*3+getEdebiyat()*2;
	}

}
