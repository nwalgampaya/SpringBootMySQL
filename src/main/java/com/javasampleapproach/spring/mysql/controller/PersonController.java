package com.javasampleapproach.spring.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.spring.mysql.model.Person;
import com.javasampleapproach.spring.mysql.repo.PersonRepository;

//@CrossOrigin(origins = "http://localhost:8081")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class PersonController {

	
	@Autowired
	PersonRepository personRepository;
	
//	@GetMapping("/persons")
    public ArrayList<String>  createArray() {
    	ArrayList<String> profession = new ArrayList<>();
    	
//    	StringBuffer doctor = "" + ""{ name: 'company1', jobs: ['job1-1', 'job1-2', 'job1-3'] } ;
    	String doctors =new String();
    	String nurse =new String();
    	doctors = doctors.concat("{"
  			+ "name: "
  			+ "'company1', "
  			+ "jobs: ['job1-1', "
  			+ "'job1-2', "
  			+ "'job1-3'] "
  			+ "}");
    	nurse = nurse.concat("{"
      			+ "name: "
      			+ "'company1', "
      			+ "jobs: ['job1-1', "
      			+ "'job1-2', "
      			+ "'job1-3'] "
      			+ "}");
//    	String doctors = "{ name: 'company1', jobs: ['job1-1', 'job1-2', 'job1-3'] } ".toString();
//    	String nurse=    "{ name: 'company2', jobs: ['job2-1', 'job2-2', 'job2-3'] }".toString() ;
    	profession.add(doctors);
    	profession.add(nurse);
    	
//    	for (String string : profession) {
//			
//    		System.out.println(string);
//		}
    	return profession;
    }
	
	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		System.out.println("Get all Persons...");

		List<Person> list = new ArrayList<>();
		Iterable<Person> customers = personRepository.findAll();

		customers.forEach(list::add);
		
		System.out.println("after for loop");
		return list;
	}

	@PostMapping("/persons/create")
	public Person createPerson(@Valid @RequestBody Person person) {
		System.out.println("Create Person: " + person.getName() + "...");

		return personRepository.save(person);
	}
	
	@DeleteMapping("/persons/{id}")
	public ResponseEntity<String> deletePerson(@PathVariable("id") Long id) {
		System.out.println("Delete persons with ID = " + id + "...");

		try {
			personRepository.deleteById(id);
		} catch (Exception e) {
			return new ResponseEntity<>("Fail to delete!", HttpStatus.EXPECTATION_FAILED);
		}

		return new ResponseEntity<>("persons has been deleted!", HttpStatus.OK);
	}
}
