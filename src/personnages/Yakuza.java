package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, int argent, String clan) {
		super(nom, "whisky", argent);
		this.clan = clan;

	}

	public void extorquer(Commercant victime) {
		victime.seFaireExtorquer();
		reputation += 1;
		gagnerArgent(argent);
	}

	public int perdre() {
		int argentPerdu = argent;
		perdreArgent(argent);
		reputation--;
		parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		return argentPerdu;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain
				+ " sous.");
	}

	public int getReputation() {
		return reputation;
	}
}
