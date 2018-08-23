package com.javasampleapproach.spring.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.spring.mysql.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
