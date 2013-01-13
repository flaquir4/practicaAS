package com.practica.as.DataLayer;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.practica.as.DataInterface.ICtrlCiutat;
import com.practica.as.DomainModel.Ciutat;
import com.practica.as.DomainModel.Client;
import com.practica.as.DomainModel.Habitacio;
import com.practica.as.DomainModel.Hotel;
import com.practica.as.DomainModel.HotelLowCost;
import com.practica.as.DomainModel.HotelSuperior;
import com.practica.as.DomainModel.Viatge;

public class CtrlCiutat implements ICtrlCiutat {
	private SessionFactory factory;
	public CtrlCiutat(){

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(Hotel.class);
		configuration.addAnnotatedClass(HotelSuperior.class);
		configuration.addAnnotatedClass(HotelLowCost.class);
		configuration.addAnnotatedClass(Habitacio.class);
		configuration.addAnnotatedClass(Client.class);
		configuration.addAnnotatedClass(Viatge.class);
		configuration.addAnnotatedClass(Ciutat.class);
		
		configuration.configure("hibernate.cfg.xml");
		factory = configuration.buildSessionFactory();


	}
	
	@Override
	public List<Ciutat> tots() {
		// TODO ?????
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery("from Ciutat");
		List<Ciutat> tots = q.list();
		tx.commit();
		return tots;
	}
	
	public Ciutat get(String nom){
		//TODO DBDERBY
		return null;
	}

}
