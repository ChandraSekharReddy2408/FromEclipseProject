package com.persionalproject.Customer.repogitory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.persionalproject.Customer.entity.CustomerPojoEntity;
import com.persionalproject.Customer.repogitory.CustomerRepository;

@Service
public class IcustomerServiceImpl implements IcustomerService 
{

	
	// interface methods implementations
	@Autowired
	private CustomerRepository custrepo;
	
	
	@Override
	public ResponseEntity<CustomerPojoEntity> postData(CustomerPojoEntity pd) 	
	{
		custrepo.save(pd);
		return new ResponseEntity<CustomerPojoEntity>(pd,HttpStatus.ACCEPTED );
		
	}

}
