package com.javasampleapproach.spring.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.spring.mysql.model.Profession;

public interface ProfessionRepositoty extends CrudRepository<Profession, Long>{

}
