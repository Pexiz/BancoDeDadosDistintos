/**
 * 
 */
package br.com.dao.jpa;

import br.com.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.domain.jpa.ClienteJpa2;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
