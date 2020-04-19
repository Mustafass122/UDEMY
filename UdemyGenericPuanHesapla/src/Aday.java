
public abstract class Aday {

	private int turkce;
	private int matematik;
	private int fizik;
	private int edebiyat;
	private String isim;
	
	public Aday(int turkce, int matematik, int fizik, int edebiyat,String isim) {
		this.turkce = turkce;
		this.matematik = matematik;
		this.fizik = fizik;
		this.edebiyat = edebiyat;
		this.isim = isim;
	}
	
	public String getIsim() {
		return isim;
	}

	public int getTurkce() {
		return turkce;
	}
	public int getMatematik() {
		return matematik;
	}
	public int getFizik() {
		return fizik;
	}
	public int getEdebiyat() {
		return edebiyat;
	}
	
	public abstract int puanHesapla();
	
}
