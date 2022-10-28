package com.inti.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class InfosEscale extends Vol {


	public InfosEscale(String heuredepart, String heurearrivee) {
		super(heuredepart, heurearrivee);
	}

}
