package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;

@RestController
public class CustomerController {
	@Autowired
	CustomerRepo customerRepo;
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		Customer cust = customerRepo.save(customer);
		if (cust != null) {
			return cust;
		} else {
			return null;
		}

	}
	
	@GetMapping("/getAllCustomer")
	public List<Customer> getAllCustomer(){
		List<Customer> customers = customerRepo.findAll();
		return customers;
	}
	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable int id){
		Optional<Customer> customer = customerRepo.findById(id);
		return customer.get();
	}

}
