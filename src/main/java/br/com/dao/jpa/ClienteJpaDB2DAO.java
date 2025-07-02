/**
 * 
 */
package br.com.dao.jpa;

import br.com.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
