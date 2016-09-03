package br.com.victorhugolgr.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.victorhugolgr.model.Cliente;
import br.com.victorhugolgr.service.ClienteService;

@Named
@ViewScoped
public class ClienteListMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Cliente cliente;

	@Inject
	private ClienteService service;

	@PostConstruct
	public void init() {
		cliente = new Cliente();
	}

	public void salvar() {
		cliente = service.insert(cliente);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso! ID = " + cliente.getId(), "INFO"));
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
