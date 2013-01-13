package com.practica.as.DataLayer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.practica.as.DataInterface.ICtrlClient;
import com.practica.as.DomainModel.Ciutat;
import com.practica.as.DomainModel.Client;
import com.practica.as.DomainModel.Habitacio;
import com.practica.as.DomainModel.Hotel;
import com.practica.as.DomainModel.HotelLowCost;
import com.practica.as.DomainModel.HotelSuperior;
import com.practica.as.DomainModel.Viatge;

public class CtrlClient implements ICtrlClient {
	private SessionFactory factory;
	public CtrlClient(){

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
	public Client get(String dni) {
		// TODO ??????
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Client q = (Client) session.get(Client.class, dni);
		tx.commit();
		return q;
	}

}
