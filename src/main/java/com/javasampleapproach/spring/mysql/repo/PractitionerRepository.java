package com.javasampleapproach.spring.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.spring.mysql.model.Practitioner;

public interface PractitionerRepository extends CrudRepository<Practitioner, Long>{

}
