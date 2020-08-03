package dao;

import java.util.List;

import org.hibernate.Session;


import Util.HibernateUtil;

public class TransportDaoImpl implements ITransportDao {

	@Override
	public void addCargaison(Cargaison c) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public 	void addMarchandise(Marchandise m, String refCarg) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Cargaison c= (Cargaison) session.get(Cargaison.class, refCarg);
		m.setCargaison(c);c.getMarchandises().add(m);
		session.save(m);
		session.getTransaction().commit();
		
	}

	@Override
	public Cargaison getCargaison(String refCarg) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Cargaison c= (Cargaison) session.get(Cargaison.class, refCarg);	
	    return c;	
	}

	@Override
	public void supprimerMarchandise(Long num) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Marchandise m= (Marchandise) session.get(Marchandise.class, num);	
		session.delete(m);
		session.getTransaction().commit();
		
		
	}

	@Override
	public List<Cargaison> getAllCargaison() {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		org.hibernate.Query req = session.createQuery("select c from Cargaison c");
		return req.list();

	}

	@Override
	public List<Marchandise> getMarchandises(String refCarg) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		org.hibernate.Query req = session.createQuery("select m from Marchandise m where m.cargaison.reference:=x");
		req.setParameter("x", refCarg);
		return req.list();

	}

	@Override
	public List<Marchandise> getMarchandisesParMC(String mc) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		org.hibernate.Query req = session.createQuery("select m from Marchandise m where m.nom like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.list();
	}

}
