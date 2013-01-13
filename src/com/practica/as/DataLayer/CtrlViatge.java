package com.practica.as.DataLayer;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.practica.as.DataInterface.ICtrlViatge;
import com.practica.as.DomainModel.Ciutat;
import com.practica.as.DomainModel.Client;
import com.practica.as.DomainModel.Habitacio;
import com.practica.as.DomainModel.Hotel;
import com.practica.as.DomainModel.HotelLowCost;
import com.practica.as.DomainModel.HotelSuperior;
import com.practica.as.DomainModel.Viatge;

public class CtrlViatge implements ICtrlViatge {

	private SessionFactory factory;

	public CtrlViatge(){

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
	public Viatge get(String dni, Date dataInici) {
		// TODO  ??????
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Client c = (Client) session.get(Client.class, dni);
		
		CmpKeyViatge vk = new CmpKeyViatge();
		vk.setClient(c);
		vk.setDataInici(dataInici);
		Viatge v = (Viatge) session.get(Viatge.class, vk);
		tx.commit();
		return v;
	}

	@Override
	public Viatge get(Client client, Date dataInici) {
		// TODO  ??????
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		CmpKeyViatge vk = new CmpKeyViatge();
		vk.setClient(client);
		vk.setDataInici(dataInici);
		Viatge v = (Viatge) session.get(Viatge.class, vk);
		tx.commit();
		return v;
	}
	
	@Override
	public void insert(Client client, Ciutat ciutat, Date dataInici, Date dataFi) {
		// TODO  ??????
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		CmpKeyViatge vk = new CmpKeyViatge();
		vk.setClient(client);
		vk.setDataInici(dataInici);
		Viatge v = new Viatge();
		v.setViatgePK(vk);
		v.setCiutat(ciutat);
		v.setDataFi(dataFi);
		session.save(v);
		tx.commit();
	}

}
