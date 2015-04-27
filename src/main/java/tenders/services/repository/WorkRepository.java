package tenders.services.repository;

import org.springframework.data.repository.CrudRepository;

import tenders.beans.Work;

public interface WorkRepository 
	extends CrudRepository<Work, Integer>{

}
