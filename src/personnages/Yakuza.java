package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, int argent,String clan) {
		super(nom, "whisky", argent);
		this.clan = clan;
		
	}
	void extorquer(Commercant victime) {
		victime.seFaireExtorquer();
		reputation +=1;
		gagnerArgent(argent);
	}


}
