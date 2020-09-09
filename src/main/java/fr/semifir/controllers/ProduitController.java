package fr.semifir.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.semifir.models.Produit;
import fr.semifir.services.ProduitService;

@RestController
@RequestMapping("produits")
public class ProduitController {

	@Autowired
	private ProduitService service;
	
	@GetMapping()
	public Iterable<Produit> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Produit findById(@PathVariable Long id) {
		return this.service.findById(id);
	}
	
	@PostMapping()
	public void save(@RequestBody Produit produit) {
		this.service.save(produit);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Produit produit) {
		this.service.delete(produit);
	}
}
