package com.persionalproject.Customer.repogitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persionalproject.Customer.entity.CustomerPojoEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerPojoEntity, Integer> 
{
	
//default methods implementation by repository like findBy, save, put, delete , post,get ...... 
	
	
	
}
