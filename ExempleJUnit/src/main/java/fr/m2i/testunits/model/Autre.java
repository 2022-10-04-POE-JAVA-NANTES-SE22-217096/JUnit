package fr.m2i.testunits.model;

import lombok.Data;

@Data
public class Autre {

	
	private String nom;
	private String prenom;
	
	
	public Autre(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}
}
