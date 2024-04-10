package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	
	protected Reservation(int jour, int mois) {
		this.jour =jour;
		this.mois =mois;
	}
	
	public String toString() {
		return "Le " + getJour() + "/" + getMois() + "\n";
	}
	
	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}


}
