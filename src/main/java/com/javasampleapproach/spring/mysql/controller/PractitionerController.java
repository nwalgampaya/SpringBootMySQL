package com.javasampleapproach.spring.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.spring.mysql.model.Practitioner;
import com.javasampleapproach.spring.mysql.repo.PractitionerRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class PractitionerController {

	
	@Autowired
	PractitionerRepository practitionerRepository;
	

	@GetMapping("/practitioners")
	public List<Practitioner> getAllPractitioners() {
		System.out.println("Get all Practitioners...");

		List<Practitioner> list = new ArrayList<>();
		Iterable<Practitioner> practitioner = practitionerRepository.findAll();

		practitioner.forEach(list::add);
		
		System.out.println("after for loop");
		return list;
	}
}
