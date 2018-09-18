package com.javasampleapproach.spring.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.spring.mysql.model.Age;
import com.javasampleapproach.spring.mysql.model.Specialty;
import com.javasampleapproach.spring.mysql.repo.AgeRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class AgeController {

	
	@Autowired
	AgeRepository ageRepository;
	
	@GetMapping("/ageRecs")
	private List<Age>  getAllAge() {
		System.out.println("Get all Age...");

		List<Age> list = new ArrayList<>();
		Iterable<Age> ages = ageRepository.findAll();

		ages.forEach(list::add);
		return list;
	}
	
	@GetMapping("/ageRecs/{age}")
	private Age getByname(@PathVariable ("age") int age) {
		
//		Age agerec = ageRepository.findByMinAgeGreaterThan(age);
//		Age agerec = ageRepository.findByMinAgeGreaterThanAndLessThan(age,age);
		Age agerec = ageRepository.findByMinAgeGreaterThan(age);
		
		return agerec;
	}
}
