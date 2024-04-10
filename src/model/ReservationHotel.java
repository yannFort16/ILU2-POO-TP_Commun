package model;

public class ReservationHotel extends Reservation{
	private int nbLitsSimple;
	private int nbLitsDouble;
	private int numChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitsSimple, 
			int nbLitsDouble, int numChambre) {
		super(jour, mois);
		this.nbLitsSimple = nbLitsSimple;
		this.nbLitsDouble = nbLitsDouble;
		this.numChambre = numChambre;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"chambre n°" + numChambre+1 + " avec " +
				nbLitsSimple + " lits simples et " +
				nbLitsDouble + " lits doubles.";
		
	}
	
}
