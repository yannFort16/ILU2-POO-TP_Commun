package model;

public abstract class EntiteReservable <U extends Formulaire>{
	private int numero;
	private CalendrierAnnuel calandrier;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean estLibre(U formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calandrier.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(U formulaire);
	
	public abstract void reserver(U formulaire);
}
