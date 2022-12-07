package fr.m2i.testunits.model;

import lombok.Data;

@Data
public class User {
	
	private String nom;
	private String prenom;
	
	
	public User(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}

}
