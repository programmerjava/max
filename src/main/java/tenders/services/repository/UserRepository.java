package tenders.services.repository;

import org.springframework.data.repository.CrudRepository;

import tenders.beans.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
