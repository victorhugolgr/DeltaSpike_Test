package br.com.victorhugolgr.util.cdi.produces;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@ApplicationScoped
public class EntityManagerProducer {
	@PersistenceUnit
	private EntityManagerFactory emf;

	@Produces @RequestScoped
	public EntityManager create() {
		System.out.println("********************************************************************************************");
		System.out.println(emf);
		return emf.createEntityManager();
	}

	public void close(@Disposes EntityManager em) {
		if (em.isOpen()) {
			em.close();
		}
	}
}
