package com.persionalproject.Customer.repogitory.service;

import org.springframework.http.ResponseEntity;

import com.persionalproject.Customer.entity.CustomerPojoEntity;

public interface IcustomerService 
{
	//abstract service methods
	public ResponseEntity<CustomerPojoEntity> postData(CustomerPojoEntity pd);
	
	

}
