package br.com.victorhugolgr.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import br.com.victorhugolgr.model.Cliente;

@Repository
public interface ClienteRepository extends EntityRepository<Cliente, Long>{

}
