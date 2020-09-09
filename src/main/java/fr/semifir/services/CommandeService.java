package fr.semifir.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Commande;
import fr.semifir.repositories.CommandeRepository;

@Service
public class CommandeService {

	@Autowired
	private CommandeRepository repository;
	
	public Iterable<Commande> findAll() {
		return this.repository.findAll();
	}
	
	public Commande findById(Long id) {
		return this.repository.findById(id).get();
	}
	
	public Iterable<Commande> findByClientId(Long id) {
		return this.repository.findByClientId(id);
	}
	
	public void save(Commande commande) {
		this.repository.save(commande);
	}
	
	public void delete(Commande commande) {
		this.repository.delete(commande);
	}
}
