package dao;	

import java.util.Date;

import Util.HibernateUtil;

public class testDao {

	public static void main(String[] args) {

    // HibernateUtil.getSessionFactory();
		
		TransportDaoImpl dao = new TransportDaoImpl();
		dao.addCargaison(new CargaisonAerienne("CA1", 500, new Date(), 700));
		dao.addCargaison(new CargaisonAerienne("CA2", 600, new Date(), 600));
		dao.addCargaison(new CargaisonRoutiere("CR1", 300, new Date(), 40));
		
		dao.addMarchandise(new Marchandise(200, 400, "ordinateurs"), "CA1");
		dao.addMarchandise(new Marchandise(100, 200, "impriments"), "CA1");
		dao.addMarchandise(new Marchandise(100, 400, "CD"), "CR1");
		dao.addMarchandise(new Marchandise(150, 200, "tablettes"), "CA2");

	}

}
