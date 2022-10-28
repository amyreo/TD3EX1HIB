package com.inti.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.Session;

@Entity
@Table
public class Reservation {

	@Id
	int idR;
	String dateR;
	String numR;

	@ManyToOne
	@JoinColumn(name = "idcwlient")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "idVol")
	private Vol vol;

	@ManyToOne
	@JoinColumn(name = "idP")
	private Passager passager;
	
	@Override
	public String toString() {
		return "Reservation [idR=" + idR + ", dateR=" + dateR + ", numR=" + numR + ", client=" + client + ", vol=" + vol
				+ "]";
	}

	public int getIdR() {
		return idR;
	}

	public void setIdR(int idR) {
		this.idR = idR;
	}

	public String getDateR() {
		return dateR;
	}

	public void setDateR(String dateR) {
		this.dateR = dateR;
	}

	public String getNumR() {
		return numR;
	}

	public void setNumR(String numR) {
		this.numR = numR;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Reservation(int idR, String dateR, String numR, Client client, Vol vol) {
		super();
		this.idR = idR;
		this.dateR = dateR;
		this.numR = numR;
		this.client = client;
		this.vol = vol;
	}

	public Reservation() {
		super();
	}

	public Reservation(int idR, String dateR, String numR) {
		super();
		this.idR = idR;
		this.dateR = dateR;
		this.numR = numR;
	}
	
	public static void AnnulerReservation(Session session) {
		// avant la fonction mettre un session.save(reservation)
    	session.getTransaction().rollback();
	}
	
	public static void ConfirmerReservation(Session session) {
		// avant la fonction mettre un session.save(reservation)
    	session.getTransaction().commit();
	}

}
