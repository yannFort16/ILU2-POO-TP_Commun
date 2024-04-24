package model;

public abstract class Formulaire {
	//private int numReservation=0;
	private int jour;
	private int mois;
	private int numEntite =0;
	
	public Formulaire (int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	public int getJour() {
		return jour;
	}
	public int getMois() {
		return mois;
	}
	
	public int getIdentificationEntite() {
		return numEntite;
	}
	
	public void setIdentificationEntite(int numEntite) {
		this.numEntite = numEntite;
	}
	
	public boolean isDate(int jour, int mois) {
		return 0<jour && jour<=31 && 0<mois && mois<12;
	}
}
