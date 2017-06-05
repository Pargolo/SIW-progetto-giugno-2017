package galleria.repository.jpa;

import javax.persistence.EntityManager;

import galleria.model.Autore;

public class AutoreRepository extends CrudRepositoryJPA<Autore> {
	
	public AutoreRepository(EntityManager em) {
		super(em, Autore.class);
	}

}
