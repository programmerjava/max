package tenders.controllers;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import tenders.beans.Comment;
import tenders.beans.Offer;
import tenders.beans.User;
import tenders.services.repository.CommentRepository;
import tenders.services.repository.OfferRepository;
import tenders.services.repository.UserRepository;

@Controller
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	UserRepository users;

	@Autowired
	CommentRepository comments;

	@Autowired
	OfferRepository offers;

	@RequestMapping("/add")
	@ResponseStatus(HttpStatus.OK)
	public void add(@RequestParam("offerId") Integer offerId,
			@RequestParam("text") String text) {


		String login = SecurityContextHolder.getContext().getAuthentication()
				.getName();

		User user = users.findOne(login);
		if (user == null)
			throw new AccessDeniedException("user by login '" + login
					+ "' not found!!");

		Offer offer = offers.findOne(offerId);
		if (offer == null)
			throw new AccessDeniedException("bad 'offerId' value");

		if (!offer.getContractor().getLogin().equals(login))
			throw new AccessDeniedException("bad 'offerId' value");

		Comment comment = new Comment();
		comment.setUser(user);

		comment.setTime(LocalDateTime.now());
		comment.setOffer(offer);
		comments.save(comment);

	}

	@RequestMapping("/list")
	@ResponseBody
	public List<Comment> list(@RequestParam("offerId") Integer offerId) {
		String login = SecurityContextHolder.getContext().getAuthentication()
				.getName();

		User user = users.findOne(login);
		if (user == null)
			throw new AccessDeniedException("user by login '" + login
					+ "' not found!!");

		Offer offer = offers.findOne(offerId);
		if (offer == null)
			throw new AccessDeniedException("bad 'offerId' value");

		if (!offer.getContractor().getLogin().equals(login))
			throw new AccessDeniedException("bad 'offerId' value");
		

		List<Comment> list = comments.findAll(offerId);
		for (Comment comment : list) {
			comment.setReaded(true);
			comments.save(comment);
		}
		return list;
	}

}
