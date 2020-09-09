package fr.semifir.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.Client;
import fr.semifir.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public Iterable<Client> findAll() {
		return this.repository.findAll();
	}
	
	public Client findById(Long id) {
		return this.repository.findById(id).get();
	}
	
	public void save(Client client) {
		this.repository.save(client);
	}
	
	public void delete(Client client) {
		this.repository.delete(client);
	}
}
