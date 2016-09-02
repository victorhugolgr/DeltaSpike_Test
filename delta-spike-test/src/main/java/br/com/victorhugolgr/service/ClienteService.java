package br.com.victorhugolgr.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.deltaspike.jpa.api.transaction.Transactional;

import br.com.victorhugolgr.model.Cliente;
import br.com.victorhugolgr.repository.ClienteRepository;

@Transactional
public class ClienteService {

	@Inject
	private ClienteRepository clienteRepository;
	
	public Cliente insert(Cliente entity) {
		
		return clienteRepository.save(entity);

	}
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}
	
}
