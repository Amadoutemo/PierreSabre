package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom,"thé", argent);
		}
	public int seFaireExtorquer() {
		int argentvol = argent;
		perdreArgent(argentvol);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentvol;
	}
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
		}
}
