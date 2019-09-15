package in.findia.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


/**
 * Base JAP repository to manipulate all Findia domain entities
 * 
 * @author Shriram
 *
 * @param <T> domain object
 * @param <ID> PK id
 */
@NoRepositoryBean
public interface FindiaBaseJPARepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
	
	boolean exists(ID id);
	
	T findOne(ID id);
   
	<S extends T> S save(S entity);

	/**
	 * Flushes all pending changes to the database.
	 */
	void flush();
}
