package dao;

import java.util.Date;

public class CargaisonRoutiere extends Cargaison{
private double temperature;

public double getTemperature() {
	return temperature;
}

public void setTemperature(double temperature) {
	this.temperature = temperature;
}

public CargaisonRoutiere() {
	super();
	// TODO Auto-generated constructor stub
}

public CargaisonRoutiere(String reference, int distance, Date dateLivraison, double temperature) {
	super(reference, distance, dateLivraison);
	this.temperature = temperature;
}
}
