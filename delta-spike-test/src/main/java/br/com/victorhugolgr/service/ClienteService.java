package br.com.victorhugolgr.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import org.apache.deltaspike.jpa.api.transaction.Transactional;

import br.com.victorhugolgr.model.Cliente;
import br.com.victorhugolgr.repository.ClienteRepository;

public class ClienteService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ClienteRepository clienteRepository;

	@Transactional
	public Cliente insert(Cliente entity) {
		return clienteRepository.save(entity);
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

}
