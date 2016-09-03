package br.com.victorhugolgr.test;

import javax.inject.Inject;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.victorhugolgr.model.Cliente;
import br.com.victorhugolgr.service.ClienteService;

@RunWith(CdiTestRunner.class)
public class ClientJPATest {

	@Inject
	private ClienteService service;

	private Cliente cliente = new Cliente();

	@Before
	public void init() {
		cliente.setDocumentoReceitaFederal("1234");
		cliente.setEmail("victor.hugo@teste.com");
		cliente.setNome("Victor Hugo");
	}

	@Test
	public void insertCliente() {
		service.insert(cliente);

		service.findAll().forEach(c -> System.out.println(c.getNome()));
	}
}
