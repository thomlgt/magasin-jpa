package fr.semifir.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prix")
	private double prix;
	
	@ManyToOne
	@JoinColumn(name = "categorie_id", nullable = true)
	private Categorie categorie;
	
	public Produit() {
		
	}

	public Produit(Long id, String nom, double prix, Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.categorie = categorie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
}
