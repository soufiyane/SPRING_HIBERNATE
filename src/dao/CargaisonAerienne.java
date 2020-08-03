package dao;

import java.util.Date;

public class CargaisonAerienne extends Cargaison {
	private double poidsMax;

	public CargaisonAerienne() {
		super();
		// TODO Auto-generated constructor stub
	}



	public double getPoidsMax() {
		return poidsMax;
	}



	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}



	public CargaisonAerienne(String reference, int distance, Date dateLivraison, double poidsMax) {
		super(reference, distance, dateLivraison);
		this.poidsMax = poidsMax;
	}
}
