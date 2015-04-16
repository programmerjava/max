package tenders.services.repository;

import org.springframework.data.repository.CrudRepository;

import tenders.beans.Balance;

public interface BalanceRepository 
	extends CrudRepository<Balance, Integer> {

}
