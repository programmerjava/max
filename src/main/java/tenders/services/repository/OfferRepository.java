package tenders.services.repository;

import org.springframework.data.repository.CrudRepository;

import tenders.beans.Offer;

public interface OfferRepository 
	extends CrudRepository<Offer, Integer> {

}
