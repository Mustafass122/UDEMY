
public class Sozel extends Aday {

	public Sozel(int turkce, int matematik, int fizik, int edebiyat,String isim) {
		super(turkce, matematik, fizik, edebiyat,isim);
	}

	@Override
	public int puanHesapla() {
		return getEdebiyat()*5+getTurkce()*4+getMatematik()*3+getFizik()*2;
	}

}
