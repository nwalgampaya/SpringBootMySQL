package com.javasampleapproach.spring.mysql.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.spring.mysql.model.Age;

public interface AgeRepository extends CrudRepository<Age, Long>{

//	Age findByMinAgeGreaterThan(int age);
	
//	@Query("select u from User u where u.emailAddress = ?1")
//	@Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?0", nativeQuery = true)
//	@Query("select a from age a where a.minage >=  ?1  and a.maxage <= ?1 ")
	@Query(value = "select * from age a where a.minage >=  ?1  and a.maxage <= ?1 ", nativeQuery = true)
	Age findByMinAgeGreaterThan(int age);
}
