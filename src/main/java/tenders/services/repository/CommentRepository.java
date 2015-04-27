package tenders.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tenders.beans.Comment;

public interface CommentRepository 
	extends CrudRepository<Comment, Integer> {
	
	
	@Query("SELECT c FROM Comment c WHERE c.offer.id = :offerId")
	public List<Comment> findAll(@Param("offerId") Integer offerId);

	
	
}
