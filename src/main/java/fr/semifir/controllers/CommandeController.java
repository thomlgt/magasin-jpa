package fr.semifir.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.semifir.models.Commande;
import fr.semifir.services.CommandeService;

@RestController
@RequestMapping("commandes")
public class CommandeController {
	
	@Autowired
	private CommandeService service;
	
	@GetMapping()
	public Iterable<Commande> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Commande findById(@PathVariable Long id) {
		return this.service.findById(id);
	}
	
	@GetMapping("clients/{id}")
	public Iterable<Commande> findByClientId(@PathVariable Long id) {
		return this.service.findByClientId(id);
	}
	
	@PostMapping()
	public void save(@RequestBody Commande commande) {
		this.service.save(commande);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Commande commande) {
		this.service.delete(commande);
	}
}
