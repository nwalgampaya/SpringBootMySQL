package com.javasampleapproach.spring.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.spring.mysql.model.Person;
import com.javasampleapproach.spring.mysql.model.Profession;
import com.javasampleapproach.spring.mysql.repo.ProfessionRepositoty;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProfessionController {

	@Autowired
	ProfessionRepositoty professionRepositoty;
	
	
	@GetMapping("/professions")
	public List<Profession> getAllPersons() {
		System.out.println("Get all professions...");

		List<Profession> list = new ArrayList<>();
		Iterable<Profession> customers = professionRepositoty.findAll();

		customers.forEach(list::add);
		
		System.out.println("after for loop Profession");
		return list;
	}
}
