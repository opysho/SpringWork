package com.victor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.entities.Person;
import com.victor.repository.PersonRepository;
import com.victor.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonResource {

	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("fectchPerson")
	public List<Person> getPersons(){
		
		return personService.getAllPersons();
	}
	
	
	@PostMapping("createPerson")
	public Person addPerson(@RequestBody Person person) {
		
		personRepo.save(person);
		return person;
	}
	
	
	
}
