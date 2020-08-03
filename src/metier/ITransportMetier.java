package metier;

import java.util.List;

import dao.Cargaison;
import dao.Marchandise;

public interface ITransportMetier {
	
	public void addCargaison(Cargaison c);
	public void addMarchandise(Marchandise m, String refCarg);
	public List<Cargaison> getAllCargaison();
	public List<Marchandise> getMarchandises(String refCarg);
	public List<Marchandise> getMarchandisesParMC(String mc);
	public Cargaison getCargaison(String refCarg);
	public void supprimerMarchandise (Long num);

}
