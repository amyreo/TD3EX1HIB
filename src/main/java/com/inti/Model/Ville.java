package com.inti.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Ville implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int idville;
	private String nomville;

	// ONE TO ONE AVEC AEROPORT PAS ICI

	public Ville() {
	}

	public Ville(int idville) {
		this.idville = idville;
	}

	public Ville(int i, String nomville) {
		this.idville = i;
		this.nomville = nomville;
	}

	public int getIdville() {
		return this.idville;
	}

	public void setIdville(int idville) {
		this.idville = idville;
	}

	public String getNomville() {
		return this.nomville;
	}

	public void setNomville(String nomville) {
		this.nomville = nomville;
	}

}
