package com.inti.Model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void createReservation() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez l'identifiant de réservation");
		int idR = sc.nextInt();
		System.out.println("Entrez la date de la réservation");
		String dateR = sc.next();
		System.out.println("Entrez le numéro de réservation");
		String numR = sc.next();
		
		Reservation reservation = new Reservation(idR, dateR, numR);
		System.out.println(reservation.toString());

		System.out.println("Tapez 1 pour confirmer la réservation ou \n 2 pour annuler la réservation.");
		int choix = sc.nextInt();
		switch (choix) {
		case 1:
			session.save(reservation);
			Reservation.ConfirmerReservation(session);
			break;
		case 2:
			session.save(reservation);
			Reservation.AnnulerReservation(session);
			break;
		default:
			break;
		}
	}
}

