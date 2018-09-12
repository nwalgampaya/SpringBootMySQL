package com.javasampleapproach.spring.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.spring.mysql.model.Doctor;

public interface DocRepository extends CrudRepository<Doctor, String>{

}
