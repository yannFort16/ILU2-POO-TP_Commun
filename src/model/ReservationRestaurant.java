package model;

public class ReservationRestaurant extends Reservation{
	private String service;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		switch (numService) {
		case 1: 
			service ="premier";
			break;
		case 2:
			service ="deuxième";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + numService);
		}
		this.numTable = numTable;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"Table " + numTable + " pour le " + service + " service.";
		
	}
}
