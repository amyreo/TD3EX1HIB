package com.inti.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vol implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int idvol;
	private String datedepart;
	private String heuredepart;
	private String datearrivee;
	private String heurearrivee;

	
	@OneToMany(mappedBy = "vol")
	private List<InfosEscale> infosEscale;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "InfosEscale", joinColumns = @JoinColumn(name = "Vol"), inverseJoinColumns = @JoinColumn(name = "Aeroport"))
	private List<Aeroport> aeroport;

	@OneToMany(mappedBy = "vol", targetEntity = Reservation.class, cascade = CascadeType.ALL)
	private List<Reservation> reservation = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "CompagnieAerienne_Vol", joinColumns = @JoinColumn(name = "idVol"), inverseJoinColumns = @JoinColumn(name = "idCompagnie"))
	private List<CompagnieAerienne> compagnieAerienne = new ArrayList<>();

	public Vol() {
	}

	public Vol(int idvol) {
		this.idvol = idvol;
	}

	public Vol(String heuredepart, String heurearrivee) {
		super();
		this.heuredepart = heuredepart;
		this.heurearrivee = heurearrivee;
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

	public List<Aeroport> getAeroport() {
		return aeroport;
	}

	public void setAeroport(List<Aeroport> aeroport) {
		this.aeroport = aeroport;
	}

	public List<CompagnieAerienne> getCompagnieAerienne() {
		return compagnieAerienne;
	}

	public void setCompagnieAerienne(List<CompagnieAerienne> compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
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

	public List<InfosEscale> getInfosEscale() {
		return infosEscale;
	}

	public void setInfosEscale(List<InfosEscale> infosEscale) {
		this.infosEscale = infosEscale;
	}

}
