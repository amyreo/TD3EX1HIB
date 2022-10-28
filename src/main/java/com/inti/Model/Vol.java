package com.inti.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Vol implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int idvol;
	private String datedepart;
	private String heuredepart;
	private String datearrivee;
	private String heurearrivee;

	@ManyToOne
	@JoinColumn(name = "idaeroport")
	private Aeroport aeroport;

	@OneToMany(mappedBy = "vol", targetEntity = Reservation.class, cascade = CascadeType.PERSIST)
	private List<Reservation> reservation = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "CompagnieAerienne_Vol", joinColumns = @JoinColumn(name = "idVol"), inverseJoinColumns = @JoinColumn(name = "idCompagnie"))
	private List<CompagnieAerienne> compagnieAerienne = new ArrayList<>();

	public Vol() {
	}

	public Vol(int idvol) {
		this.idvol = idvol;
	}

	public Vol(int idvol, String datedepart, String heuredepart, String datearrivee, String heurearrivee) {
		this.idvol = idvol;
		this.datedepart = datedepart;
		this.heuredepart = heuredepart;
		this.datearrivee = datearrivee;
		this.heurearrivee = heurearrivee;
	}

	public int getIdvol() {
		return this.idvol;
	}

	public void setIdvol(int idvol) {
		this.idvol = idvol;
	}

	public String getDatedepart() {
		return this.datedepart;
	}

	public void setDatedepart(String datedepart) {
		this.datedepart = datedepart;
	}

	public String getHeuredepart() {
		return this.heuredepart;
	}

	public void setHeuredepart(String heuredepart) {
		this.heuredepart = heuredepart;
	}

	public String getDatearrivee() {
		return this.datearrivee;
	}

	public void setDatearrivee(String datearrivee) {
		this.datearrivee = datearrivee;
	}

	public String getHeurearrivee() {
		return this.heurearrivee;
	}

	public void setHeurearrivee(String heurearrivee) {
		this.heurearrivee = heurearrivee;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	public List<CompagnieAerienne> getCompagnie_Aerienne() {
		return compagnieAerienne;
	}

	public void setCompagnie_Aerienne(List<CompagnieAerienne> compagnie_Aerienne) {
		this.compagnieAerienne = compagnie_Aerienne;
	}

}
