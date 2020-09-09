package fr.semifir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.semifir.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
