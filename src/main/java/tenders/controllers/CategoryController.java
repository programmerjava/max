package tenders.controllers;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import tenders.beans.Category;
import tenders.services.repository.CategoryRepository;



@Controller
@RequestMapping("/categories")
public class CategoryController {

	

	@Autowired CategoryRepository repository;
	
	
	
	
	@RequestMapping("/categories")
	@ResponseBody
	public List<Category> get() {
		LinkedList<Category> categories = new LinkedList<Category>();
		for(Category c : repository.findAll()) {
			categories.add(c);
		}
		return categories;
	}
	
	
}
