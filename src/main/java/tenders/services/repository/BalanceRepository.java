package tenders.services.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tenders.beans.Balance;

public interface BalanceRepository 
	extends CrudRepository<Balance, Integer> {

	
	
	
	@Query("SELECT b FROM Balance b WHERE b.user.login = :login")
	public Balance findOneByUserLogin(@Param("login") String login);
	
}
