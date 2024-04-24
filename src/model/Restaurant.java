package model;

public class Restaurant {

	public void ajouterTable(int nbChaise) {
		new Table(nbChaise);
	}
	
	public int[] donnerPossiblilitees (FormulaireRestaurant formulaire) {
		return null;
	}
	
	public Reservation reserver (int numEntite, FormulaireRestaurant formulaire) {
		return null;
	}
	
	private static class Table extends EntiteReservable<FormulaireRestaurant>{
		private int nbChaise;
		 
		public Table(int nbChaise) {
			this.nbChaise = nbChaise;
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void reserver(FormulaireRestaurant formulaire) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
