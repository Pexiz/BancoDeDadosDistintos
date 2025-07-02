/**
 * 
 */
package br.com.dao.jpa;

import br.com.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
