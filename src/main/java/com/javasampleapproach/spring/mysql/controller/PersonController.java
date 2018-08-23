package com.javasampleapproach.spring.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.spring.mysql.model.Book;
import com.javasampleapproach.spring.mysql.model.Person;
import com.javasampleapproach.spring.mysql.repo.PersonRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class PersonController {

	
	@Autowired
	PersonRepository personRepository;
	
	@GetMapping("/persons")
	public List<Person> getAllBooks() {
		System.out.println("Get all Persons...");

		List<Person> list = new ArrayList<>();
		Iterable<Person> customers = personRepository.findAll();

		customers.forEach(list::add);
		return list;
	}

	@PostMapping("/Persons/create")
	public Person createPerson(@Valid @RequestBody Person person) {
		System.out.println("Create Person: " + person.getfName() + "...");

		return personRepository.save(person);
	}
}
