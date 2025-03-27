package histoire;

import personnages.Humain;

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
	}
	

}
