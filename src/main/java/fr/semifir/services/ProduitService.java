package fr.semifir.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Produit;
import fr.semifir.repositories.ProduitRepository;

@Service
public class ProduitService {

	@Autowired
	private ProduitRepository repository;
	
	public Iterable<Produit> findAll() {
		return this.repository.findAll();
	}
	
	public Produit findById(Long id) {
		return this.repository.findById(id).get();
	}
	
	public void save(Produit produit) {
		this.repository.save(produit);
	}
	
	public void delete(Produit produit) {
		this.repository.delete(produit);
	}
}
