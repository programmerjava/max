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
	
	
	
	
	@RequestMapping("/list")
	@ResponseBody
	public String get() 
			throws JsonGenerationException, JsonMappingException, IOException {
		
		List<Category> list = new LinkedList<>();
		for(Category cat :repository.findAll())
			list.add(cat);
		return new ObjectMapper().writeValueAsString(list);
	}
	
	@RequestMapping("/add")
	@ResponseStatus(value=HttpStatus.OK)
	public void add(@RequestBody Category category) {
		repository.save(category);
	}
	
	
}
