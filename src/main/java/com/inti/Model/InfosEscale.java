package com.inti.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class InfosEscale extends Vol {

	@Id
	private int id;
	private String heureD;
	private String heureA;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idAeroport")
	private Aeroport aeroport;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idVol")
	private Vol vol;

	public InfosEscale() {
		super();
	}

	public InfosEscale(int id, String heureD, String heureA) {
		super();
		this.id = id;
		this.heureD = heureD;
		this.heureA = heureA;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeureD() {
		return heureD;
	}

	public void setHeureD(String heureD) {
		this.heureD = heureD;
	}

	public String getHeureA() {
		return heureA;
	}

	public void setHeureA(String heureA) {
		this.heureA = heureA;
	}

	public List<Aeroport> getAeroport() {
		return (List<Aeroport>) aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "InfosEscale [id=" + id + ", heureD=" + heureD + ", heureA=" + heureA + ", aeroport=" + aeroport
				+ ", vol=" + vol + "]";
	}

	}
