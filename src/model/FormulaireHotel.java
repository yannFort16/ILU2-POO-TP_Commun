package model;

public class FormulaireHotel extends Formulaire{
	private int nbLitsSimple;
	private int nbLitsDouble;

	public FormulaireHotel(int jour, int mois, int nbLitsSimple, int nbLitsDouble) {
		super(jour, mois);
		this.nbLitsSimple = nbLitsSimple;
		this.nbLitsDouble = nbLitsDouble;
	}

	public int getNbLitsSimple() {
		return nbLitsSimple;
	}

	public int getNbLitsDouble() {
		return nbLitsDouble;
	}
}
