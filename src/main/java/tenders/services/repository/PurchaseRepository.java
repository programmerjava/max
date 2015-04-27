package tenders.services.repository;

import org.springframework.data.repository.CrudRepository;

import tenders.beans.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Integer>{

}
