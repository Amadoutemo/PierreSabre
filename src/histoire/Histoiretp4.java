package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class Histoiretp4 {
	public static void main(String[] args) {
		Humain prof = new Humain("prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson",12);
		prof.boire();
		prof.perdreArgent(12);
		prof.acheter("jeu", 2);
		prof.perdreArgent(2);
		prof.acheter("kimono", 50);
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza yaku = new Yakuza("Yaku le noir",30,"Warsong");
		yaku.direBonjour();
	}
	

}
