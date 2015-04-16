package tenders.services.repository;

import org.springframework.data.repository.CrudRepository;

import tenders.beans.BalanceChangeEvent;

public interface BalanceLogRepository extends
		CrudRepository<BalanceChangeEvent, Integer> {

}
