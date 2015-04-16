package tenders.services.repository;

import org.springframework.data.repository.CrudRepository;

import tenders.beans.Category;

public interface CategoryRepository 
	extends CrudRepository<Category, Integer> {

}
