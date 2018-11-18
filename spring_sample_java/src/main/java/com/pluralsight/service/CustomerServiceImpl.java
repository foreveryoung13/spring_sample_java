package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.Repository.CustomerRepository;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}

	/* Setter Injection 
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We Are Using setter injection");
		this.customerRepository = customerRepository;
	} */ 
	
	/* Constructor Injection 
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We Are Using Constructor injection");
		this.customerRepository = customerRepository;
	} */ 

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	
}
