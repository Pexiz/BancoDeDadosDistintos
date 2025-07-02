/**
 * 
 */
package br.com.dao.jpa;

import br.com.dao.generic.jpa.IGenericJapDAO;
import br.com.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
