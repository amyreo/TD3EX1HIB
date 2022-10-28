package com.inti.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Aeroport implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int idaeroport;
	private String nomaeroport;

	@OneToMany(mappedBy = "aeroport")
	private List<InfosEscale> infosEscale;
	
	@OneToOne
	@JoinColumn(name = "idVille")
	private Ville ville;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "InfosEscale", joinColumns = @JoinColumn(name = "Aeroport"), inverseJoinColumns = @JoinColumn(name = "Vol"))
	private List<Vol> vol = new ArrayList<>();

	public Aeroport() {
	}

	public Aeroport(int idaeroport) {
		this.idaeroport = idaeroport;
	}

	public Aeroport(int idaeroport, String nomaeroport) {
		this.idaeroport = idaeroport;
		this.nomaeroport = nomaeroport;
	}

	public int getIdaeroport() {
		return this.idaeroport;
	}

	public void setIdaeroport(int idaeroport) {
		this.idaeroport = idaeroport;
	}

	public String getNomaeroport() {
		return this.nomaeroport;
	}

	public void setNomaeroport(String nomaeroport) {
		this.nomaeroport = nomaeroport;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<Vol> getVol() {
		return vol;
	}

	public void setVol(List<Vol> vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "Aeroport [idaeroport=" + idaeroport + ", nomaeroport=" + nomaeroport + "]";
	}

	public List<InfosEscale> getInfosEscale() {
		return infosEscale;
	}

	public void setInfosEscale(List<InfosEscale> infosEscale) {
		this.infosEscale = infosEscale;
	}

}
