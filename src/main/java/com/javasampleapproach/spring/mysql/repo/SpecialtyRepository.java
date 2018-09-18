package com.javasampleapproach.spring.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.spring.mysql.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long>{
	
	Specialty findByName(String name);

}
