package com.persionalproject.Customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persionalproject.Customer.entity.CustomerPojoEntity;
import com.persionalproject.Customer.repogitory.CustomerRepository;
import com.persionalproject.Customer.repogitory.service.IcustomerService;

@RestController
@RequestMapping("Customer")
public class ControllerClass 
{
	@Autowired
	private CustomerRepository customerrepo;
	
	
	@Autowired
	private IcustomerService custservice;
	
	/*
	 * @PostMapping("/postdata") public ResponseEntity<CustomerPojoEntity> postDate
	 * (@RequestBody CustomerPojoEntity pt) { customer.save(pt); return new
	 * ResponseEntity<CustomerPojoEntity>(pt,HttpStatus.ACCEPTED);
	 * 
	 * }
	 * 
	 * @GetMapping("/getdata/{id}") public ResponseEntity<CustomerPojoEntity>
	 * getsingleDataById(@PathVariable Integer id) {
	 * System.out.println("the Entered id is "+ id); Optional<CustomerPojoEntity>
	 * cust = customer.findById(id); System.out.println(cust);
	 * 
	 * if (cust.isPresent()) { return new
	 * ResponseEntity<CustomerPojoEntity>(cust.get(),HttpStatus.OK); } return new
	 * ResponseEntity<CustomerPojoEntity>(HttpStatus.NOT_FOUND);
	 * 
	 * }
	 * 
	 * @GetMapping("/getAllData") public ResponseEntity<List<CustomerPojoEntity>>
	 * getAllData() {
	 * 
	 * List<CustomerPojoEntity> cust = customer.findAll(); System.out.println(cust);
	 * 
	 * if (cust!=null) { return new
	 * ResponseEntity<List<CustomerPojoEntity>>(cust,HttpStatus.OK); } return new
	 * ResponseEntity<List<CustomerPojoEntity>>(HttpStatus.NOT_FOUND);
	 * 
	 * }
	 * 
	 * @PutMapping("update") public ResponseEntity<CustomerPojoEntity>
	 * updateData(@RequestBody CustomerPojoEntity pt) {
	 * 
	 * customer.save(pt); return new
	 * ResponseEntity<CustomerPojoEntity>(pt,HttpStatus.ACCEPTED); }
	 * 
	 * 
	 * @DeleteMapping("/deleteData/{id}") public ResponseEntity<CustomerPojoEntity>
	 * deletesingleDataById(@PathVariable Integer id) { customer.deleteById(id);
	 * return new ResponseEntity<CustomerPojoEntity>(HttpStatus.UNAUTHORIZED);
	 * 
	 * }
	 */
	@PostMapping("postData")
	public ResponseEntity<CustomerPojoEntity> postData(@RequestBody  CustomerPojoEntity pt)
	{
		custservice.postData(pt);
	    return new ResponseEntity<CustomerPojoEntity>(pt, HttpStatus.ACCEPTED);
		
	}
}
