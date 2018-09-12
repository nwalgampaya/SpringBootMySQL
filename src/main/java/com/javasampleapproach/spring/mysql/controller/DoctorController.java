package com.javasampleapproach.spring.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.spring.mysql.model.Doctor;
import com.javasampleapproach.spring.mysql.repo.DocRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class DoctorController {

	@Autowired
	DocRepository docrepo; 

	@GetMapping("/doctors")
	public List<Doctor> getAllBooks() {
		System.out.println("Get all Docs...");

		List<Doctor> list = new ArrayList<>();
		Iterable<Doctor> doctors = docrepo.findAll();

		doctors.forEach(list::add);
		return list;
	}
}
