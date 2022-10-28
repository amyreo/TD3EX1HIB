package com.inti.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Client {
	@Id
	private int idClient;
	private String nom_prenom;
	private String telephone;
	private String email;

	@OneToMany(mappedBy = "client", targetEntity = Reservation.class)
	private List<Reservation> reservation = new ArrayList<>();

	public Client() {
		super();
	}

	public Client(int idClient, String nom_prenom, String telephone, String email) {
		super();
		this.idClient = idClient;
		this.nom_prenom = nom_prenom;
		this.telephone = telephone;
		this.email = email;
	}

	public Client(int idClient, String nom_prenom, String telephone, String email, List<Reservation> reservation) {
		super();
		this.idClient = idClient;
		this.nom_prenom = nom_prenom;
		this.telephone = telephone;
		this.email = email;
		this.reservation = reservation;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNom_prenom() {
		return nom_prenom;
	}

	public void setNom_prenom(String nom_prenom) {
		this.nom_prenom = nom_prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom_prenom=" + nom_prenom + ", telephone=" + telephone + ", email="
				+ email + ", reservation=" + reservation + "]";
	}

}
