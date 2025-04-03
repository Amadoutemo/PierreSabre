package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, int argent) {
		super(nom, "shochu", argent);
	}

	public void donner(Commercant beneficiaire) {
		int don = argent / 10;
		perdreArgent(don);
		beneficiaire.recevoir(don);
		parler(beneficiaire.nom + " prend ces " + don + " sous.");
	}

	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = honneur * 2;

		if (force >= adversaire.getReputation()) {
			honneur++;
			int argentGagne = adversaire.perdre();
			gagnerArgent(argentGagne);
			parler("Je t' ai eu petit yakuza!");
		} else {
			honneur--;
			int argentPerdu = argent;
			perdreArgent(argent);
			adversaire.gagner(argentPerdu);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		}
	}

}
