package tenders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import tenders.services.repository.OfferRepository;


@RequestMapping("/offer")
@Controller
public class OfferController {

	
	
	
	@Autowired OfferRepository repository;
	
	
	
	
	@RequestMapping("/add")
	@ResponseStatus(HttpStatus.OK)
	public void add() {
		
		throw new UnsupportedOperationException();
		
	}
	
	
	
	
	
}
