package dao;

import java.io.Serializable;

public class Marchandise implements Serializable {
	private long numero;
	private double poids, volume;
	private String nom;
    private Cargaison cargaison;

	public Cargaison getCargaison() {
		return cargaison;
	}
	public void setCargaison(Cargaison cargaison) {
		this.cargaison = cargaison;
	}
	public Marchandise(double poids, double volume, String nom) {
		super();
		this.poids = poids;
		this.volume = volume;
		this.nom = nom;
	}
	public Marchandise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
