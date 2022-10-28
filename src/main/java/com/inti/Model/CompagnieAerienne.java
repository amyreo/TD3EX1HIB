package com.inti.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table
public class CompagnieAerienne {
	@Id
	int idCompagnie;
	String nomcompagnie;

	@ManyToMany
	@JoinTable(name = "CompagnieAerienne_Vol", joinColumns = @JoinColumn(name = "idCompagnie"), inverseJoinColumns = @JoinColumn(name = "idVol"))
	private List<Vol> vol = new ArrayList<>();

	public CompagnieAerienne() {
		super();
	}

	public CompagnieAerienne(int idCompagnie, String nomcompagnie) {
		super();
		this.idCompagnie = idCompagnie;
		this.nomcompagnie = nomcompagnie;
	}

	public CompagnieAerienne(int idCompagnie, String nomcompagnie, List<Vol> vol) {
		super();
		this.idCompagnie = idCompagnie;
		this.nomcompagnie = nomcompagnie;
		this.vol = vol;
	}

	public int getIdCompagnie() {
		return idCompagnie;
	}

	public void setIdCompagnie(int idCompagnie) {
		this.idCompagnie = idCompagnie;
	}

	public String getNomcompagnie() {
		return nomcompagnie;
	}

	public void setNomcompagnie(String nomcompagnie) {
		this.nomcompagnie = nomcompagnie;
	}

	public List<Vol> getVol() {
		return vol;
	}

	public void setVol(List<Vol> vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "CompagnieAerienne [idCompagnie=" + idCompagnie + ", nomcompagnie=" + nomcompagnie + ", vol=" + vol
				+ "]";
	}

}
