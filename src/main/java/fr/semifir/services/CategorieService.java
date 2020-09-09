package fr.semifir.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Categorie;
import fr.semifir.repositories.CategorieRepository;

@Service
public class CategorieService {

	@Autowired
	private CategorieRepository repository;
	
	public Iterable<Categorie> findAll() {
		return this.repository.findAll();
	}
	
	public Categorie findById(Long id) {
		return this.repository.findById(id).get();
	}
	
	public void save(Categorie categorie) {
		this.repository.save(categorie);
	}
	
	public void delete(Categorie categorie) {
		this.repository.delete(categorie);
	}
}

