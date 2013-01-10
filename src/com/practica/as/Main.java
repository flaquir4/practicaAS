package com.practica.as;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.practica.as.DataLayer.CmpKeyHabitacio;
import com.practica.as.DataLayer.CmpKeyHotel;
import com.practica.as.DomainModel.Habitacio;
import com.practica.as.DomainModel.Hotel;
import com.practica.as.DomainModel.HotelLowCost;
import com.practica.as.DomainModel.HotelSuperior;

public class Main {

	public static void main(String[] args) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Hotel.class);
		config.addAnnotatedClass(HotelSuperior.class);
		config.addAnnotatedClass(HotelLowCost.class);
		config.addAnnotatedClass(Habitacio.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		
		// Session per provar setters:
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
				
		Hotel hotel1 = new Hotel();
		CmpKeyHotel hotelKey1 = new CmpKeyHotel("Barcelona", "Marina");
		hotel1.setHotelPK(hotelKey1);
		hotel1.setPreu(100);
		
		HotelLowCost hotel2 = new HotelLowCost();
		CmpKeyHotel hotelKey2 = new CmpKeyHotel("Valencia", "Marina");
		hotel2.setHotelPK(hotelKey2);
		hotel2.setPreu(200);
		hotel2.setDescompte(20);

		HotelSuperior hotel3 = new HotelSuperior();
		CmpKeyHotel hotelKey3 = new CmpKeyHotel("Barcelona", "City");
		hotel3.setHotelPK(hotelKey3);
		hotel3.setPreu(300);
		hotel3.setRecarrec(30);

		session.save(hotel1);
		session.save(hotel2);
		session.save(hotel3);
		
		Habitacio habi1 = new Habitacio();
		CmpKeyHabitacio habiPK1 = new CmpKeyHabitacio(hotel1, 101);
		habi1.setHabitacioPK(habiPK1);

		Habitacio habi2 = new Habitacio();
		CmpKeyHabitacio habiPK2 = new CmpKeyHabitacio(hotel2, 202);
		habi2.setHabitacioPK(habiPK2);

		Habitacio habi3 = new Habitacio();
		CmpKeyHabitacio habiPK3 = new CmpKeyHabitacio(hotel3, 303);
		habi3.setHabitacioPK(habiPK3);

		session.save(habi1);
		session.save(habi2);
		session.save(habi3);
		
		session.getTransaction().commit();

		
		// Session per provar getters:
		
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		CmpKeyHotel hpk1 = new CmpKeyHotel("Barcelona", "Marina");
		Hotel h1 = (Hotel) session.get(Hotel.class, hpk1);
		
		System.out.println("Hotel 1:");
		System.out.print(h1.getHotelPK().getCiutat() + ", ");
		System.out.print(h1.getHotelPK().getNom() + " : ");
		System.out.print(h1.getPreu() + "€ --> [ ");
		for (Habitacio hab : h1.getHabitacions()) {
			System.out.print(hab.getHabitacioPK().getNumero() + " ");
		}
		System.out.print(" ]");
		System.out.println();
		
		
		CmpKeyHabitacio habpk1 = new CmpKeyHabitacio(h1, 101);
		Habitacio hab1 = (Habitacio) session.get(Habitacio.class, habpk1);
		
		System.out.println("Habitacio 1:");
		System.out.print(hab1.getHabitacioPK().getHotel().getHotelPK().getCiutat() + ", ");
		System.out.print(hab1.getHabitacioPK().getHotel().getHotelPK().getNom() + ", ");
		System.out.print(hab1.getHabitacioPK().getNumero());
		System.out.println();
				
		session.getTransaction().commit();
		
	}

}
