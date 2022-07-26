package fr.eni.quimper.exo.Bureau.de.vote.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Electeur {
	@Id
	@GeneratedValue
	private Integer idElecteur ;
	private String nom ;
	private String prenom ;
	private Integer age;
	private String nationalite;
	
	@ManyToOne
	private Candidat candidat;
	
	public Electeur(String nom, String prenom, Integer age, String nationalite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.nationalite = nationalite;
	}
	public Electeur(String nom, String prenom, Integer age, String nationalite, Candidat candidat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.nationalite = nationalite;
		candidat.addElecteur1(this);
	}
				
}
