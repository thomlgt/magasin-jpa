package fr.semifir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.semifir.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{

	public Iterable<Commande> findByClientId(Long id);
}
