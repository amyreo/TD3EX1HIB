package com.inti.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Passager {
	@Id
	int IdP;
	String nom;

	@ManyToOne
	@JoinColumn(name = "idR")
	private Reservation reservation;

	public Passager() {
		super();
	}

	public Passager(int idP, String nom) {
		super();
		IdP = idP;
		this.nom = nom;
	}

	public Passager(int idP, String nom, Reservation reservation) {
		super();
		IdP = idP;
		this.nom = nom;
		this.reservation = reservation;
	}

	public int getIdP() {
		return IdP;
	}

	public void setIdP(int idP) {
		IdP = idP;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Passager [IdP=" + IdP + ", nom=" + nom + ", reservation=" + reservation + "]";
	}

}
