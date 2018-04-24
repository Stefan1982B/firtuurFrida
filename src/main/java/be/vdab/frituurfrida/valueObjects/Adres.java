package be.vdab.frituurfrida.valueObjects;

public class Adres {
	private String straat;
	private int Huisnr;
	private Gemeente gemeente;

	public Gemeente getGemeente() {
		return gemeente;
	}

	public void setGemeente(Gemeente gemeente) {
		this.gemeente = gemeente;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public int getHuisnr() {
		return Huisnr;
	}

	public void setHuisnr(int huisnr) {
		Huisnr = huisnr;
	}

	public Adres(String straat, int huisnr, Gemeente gemeente) {
		this.straat = straat;
		Huisnr = huisnr;
		this.gemeente = gemeente;
	}

	public Adres() {
	}

}
