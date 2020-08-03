package metier;

import java.util.List;

import dao.Cargaison;
import dao.ITransportDao;
import dao.Marchandise;

public class MetiertransportImpl implements ITransportMetier {
	private ITransportDao dao;

	public ITransportDao getDao() {
		return dao;
	}

	public void setDao(ITransportDao dao) {
		this.dao = dao;
		System.out.print("injection Dao");
	}

	@Override
	public void addCargaison(Cargaison c) {
		dao.addCargaison(c);
		
	}

	@Override
	public void addMarchandise(Marchandise m, String refCarg) {
		dao.addMarchandise(m, refCarg);
		
	}

	@Override
	public List<Cargaison> getAllCargaison() {
		
		return dao.getAllCargaison();
	}

	@Override
	public List<Marchandise> getMarchandises(String refCarg) {
		
		return dao.getMarchandises(refCarg);
	}

	@Override
	public List<Marchandise> getMarchandisesParMC(String mc) {
		return dao.getMarchandisesParMC(mc);
		}

	@Override
	public Cargaison getCargaison(String refCarg) {
		
		return dao.getCargaison(refCarg);
	}

	@Override
	public void supprimerMarchandise(Long num) {
		dao.supprimerMarchandise(num);
		
	}
	
	public void init() {
		System.out.print("Initalisation Métier");
	}

}
