package personnages;

public class Humain {
	private String boisson;
	protected String nom;
	public int argent;
	private Humain[] memoire; 
	private int taille_memoire = 30;

	private String getNom() {
		return nom;
	}

	public Humain(String nom, String boisson, int argent) {
		this.boisson = boisson;
		this.nom = nom;
		this.argent = argent;
	}

	private int getArgent() {
		return argent;
	}

	private String getBoisson() {
		return boisson;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ")" + "-" + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " j'aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS ! ");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un kimono à" + prix + " sous.");
		}

	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}
	public void faireConnaissanceAvec(Humain autrehumain) {
		direBonjour();
		autrehumain.direBonjour();
		}
	private void memoriser(Humain humain) {
		for (int i = 0; i < memoire.length; i++) {
			 memoire = 0; {
				direBonjour();
			} else {
				
				
			}
			
			
		}
	}
	private void repondre(Humain humain) {
		direBonjour();
		
	}
}
