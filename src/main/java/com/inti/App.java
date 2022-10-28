package com.inti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import com.inti.Model.Aeroport;
import com.inti.Model.HibernateUtil;
import com.inti.Model.Vol;

public class App {
	public static void main(String[] args) {

//    	HibernateUtil.createReservation();

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Vol v = new Vol(258, "15-6-90", "12h45", "15-6-90", "14h12");
//		session.save(v);
		
		Aeroport a = new Aeroport(317, "Jsp");
		List<Aeroport> la = new ArrayList<>();
		la.add(a);
		v.setAeroport(la);
		
		session.save(v);

		session.getTransaction().commit();
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);

		
		
	}

}
