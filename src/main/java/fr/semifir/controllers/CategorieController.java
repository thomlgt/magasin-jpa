package fr.semifir.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.semifir.models.Categorie;
import fr.semifir.services.CategorieService;

@RestController
@RequestMapping("categories")
public class CategorieController {

	@Autowired
	private CategorieService service;
	
	@GetMapping()
	public Iterable<Categorie> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Categorie findById(@PathVariable Long id) {
		return this.service.findById(id);
	}
	
	@PostMapping()
	public void save(@RequestBody Categorie categorie) {
		this.service.save(categorie);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Categorie categorie) {
		this.service.delete(categorie);
	}
}
