package personnages;

public class Humain {
	private String boisson;
	protected String nom;
	public int argent;
	
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
		System.out.println("("+ nom + ")" + "-" + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " j'aime boire du " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boisson + "! GLOUPS ! ");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
		parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien +  " � " + prix + " sous");
			}else {
			parler("Je n'ai plus que "+ argent + " sous en poche. Je ne peux m�me pas m'offrir un kimono �" + prix + " sous.");
		}
	
	}
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void  gagnerArgent(int gain) {
		argent+=gain;
	}
}

