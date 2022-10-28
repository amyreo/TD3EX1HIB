package com.inti;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.inti.Model.Aeroport;
import com.inti.Model.Client;
import com.inti.Model.CompagnieAerienne;
import com.inti.Model.HibernateUtil;
import com.inti.Model.Passager;
import com.inti.Model.Reservation;
import com.inti.Model.Ville;
import com.inti.Model.Vol;

public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();
    	
//    	Ville ville1 = new Ville(1, "Paris");
//    	Client client = new Client(1, "Jaq", "0632245321", "jsp@gmail.com");
    	
    	Vol vol = new Vol(4, "456", "ZEFRDGFHG", "456", "hjklkjh");
		List<Vol> lv = new ArrayList<>();
		lv.add(vol);
		
    	CompagnieAerienne ca = new CompagnieAerienne(53, "AirFFrance");
    	List<CompagnieAerienne> lc = new ArrayList<>();
    	lc.add(ca);
//    	
    	vol.setCompagnie_Aerienne(lc);
    	ca.setVol(lv);
//
    	session.save(ca);
//    	session.save(vol);
//    	
//    	session.update(ca);
//    	session.update(vol);
    	
    	
//    	Reservation res = new Reservation(1, "05-06-2022", "012");
//    	Passager pas = new Passager(1, "Marianne");
//    	Aeroport a = new Aeroport(1, "CdG");
    	
    	
//    	session.save(client);
//    	session.save(ca);
//    	session.save(res);
//    	session.save(pas);
//    	session.save(vol);
//    	session.save(a);
    	
    	session.getTransaction().commit();
    }
    
    
}
