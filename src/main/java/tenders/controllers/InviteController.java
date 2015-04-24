package tenders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import tenders.beans.Invite;
import tenders.beans.Purchase;
import tenders.services.repository.InviteRepository;



@Controller
@RequestMapping("/invite")
public class InviteController {

	
	
	@Autowired InviteRepository repo;
	
	
	@RequestMapping("/add")
	@ResponseStatus(HttpStatus.OK)
	public void add(@RequestParam("email") String email, 
			@RequestParam("company") String company,
			@RequestParam("purchaseId") Integer purchaseId, 
			@RequestParam("title") String title) {
		
		Purchase purchase = new Purchase();
		purchase.setId(purchaseId);
		
		Invite invite = new Invite();
		invite.setCompanyName(company);
		invite.setEmail(email);
		invite.setTitle(title);
		
		repo.save(invite);
	}
	
	
	
	
	
	
	
}
