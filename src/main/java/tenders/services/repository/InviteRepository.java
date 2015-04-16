package tenders.services.repository;

import org.springframework.data.repository.CrudRepository;

import tenders.beans.Invite;

public interface InviteRepository 
	extends CrudRepository<Invite, Integer> {

}
