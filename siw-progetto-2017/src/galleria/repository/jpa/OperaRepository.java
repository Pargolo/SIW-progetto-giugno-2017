package galleria.repository.jpa;

import javax.persistence.EntityManager;

import galleria.model.Opera;

public class OperaRepository extends CrudRepositoryJPA<Opera> {

	public OperaRepository(EntityManager em) {
		super(em, Opera.class);
	}

}
