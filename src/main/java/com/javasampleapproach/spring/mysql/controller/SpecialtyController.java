package com.javasampleapproach.spring.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.spring.mysql.model.Specialty;
import com.javasampleapproach.spring.mysql.repo.SpecialtyRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class SpecialtyController {

	
	
	@Autowired
	SpecialtyRepository specialtyRepository;
	
	@GetMapping("/specialties")
	private List<Specialty>  getAllSpecialty() {
		System.out.println("Get all specialties...");

		List<Specialty> list = new ArrayList<>();
		Iterable<Specialty> specialaties = specialtyRepository.findAll();

		specialaties.forEach(list::add);
		return list;
	}
	
	@GetMapping("/specialties/{name}")
	private Specialty getByname(@PathVariable ("name") String name) {
		
		Specialty specialty = specialtyRepository.findByName(name);
		return specialty;
	}
}
