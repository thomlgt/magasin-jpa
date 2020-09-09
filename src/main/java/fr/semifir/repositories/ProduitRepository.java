package fr.semifir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.semifir.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
