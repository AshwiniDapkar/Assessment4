package com.Customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Customer.entity.Customer;
import com.Customer.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@GetMapping("customers")
	private List<Customer>getAll(){
		return customerService.getAll();
	}
	@GetMapping("/{id}")
	private Customer getById(@PathVariable int id){
		return customerService.getById(id);
	}
	@PostMapping
	private Customer add(@RequestBody Customer customer){
		return customerService.addOrUpdate(customer);
	}
	@PutMapping("/{id}")
	private Customer update(@PathVariable int id,@RequestBody Customer customer){
		customer.setId(id);
		return customerService.addOrUpdate(customer);
	}
	@DeleteMapping("/{id}")
	private void delete(@PathVariable int id) {
		customerService.deleteById(id);
	}


}
