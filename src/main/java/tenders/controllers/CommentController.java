package tenders.controllers;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import tenders.beans.Comment;
import tenders.beans.Offer;
import tenders.beans.User;
import tenders.services.repository.CommentRepository;

@Controller
@RequestMapping("/comments")
public class CommentController {

	
	@Autowired CommentRepository repo;
	
	@RequestMapping("/add")
	@ResponseStatus(HttpStatus.OK)
	public void add(@RequestParam("offerId") Integer offerId,
			@RequestParam("text") String text) {
		
		// тут нужно проверить данные!!! нельзя разрешать оставлять комментарии посторонним!!
		
		
		User user = new User();
		Comment comment = new Comment();
		comment.setUser(user);
		
		comment.setTime(LocalDateTime.now());
		
		
		Offer offer = new Offer();
		offer.setId(offerId);
		comment.setOffer(offer);
		repo.save(comment);
		
		throw new UnsupportedOperationException();
	}
	
	
	@RequestMapping("/list")
	@ResponseBody
	public String list(@RequestParam("offerId") Integer offerId)
			throws JsonGenerationException, JsonMappingException, IOException {
		
		
		Offer offer = new Offer();
		offer.setId(offerId);
		
		
		List<Comment> comments = repo.findAll(offerId);
		for(Comment comment : comments) {
			comment.setReaded(true);
			repo.save(comment);
			
			comment.setOffer(offer);
			String uid = comment
					.getUser().getLogin();
			User user = new User();
			user.setLogin(uid);
			comment.setUser(user);
		}
		
		return new ObjectMapper().writeValueAsString(comments);
	}
	
	
}
