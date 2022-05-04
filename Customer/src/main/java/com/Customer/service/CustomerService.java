package com.Customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Customer.entity.Customer;
import com.Customer.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer addOrUpdate(Customer customer) {
		return customerRepository.save(customer);
			}
	public boolean deleteById(int id) {
		customerRepository.deleteById(id);
	return true;
	}
	public List<Customer>getAll(){
		return customerRepository.findAll();
			}
	public Customer getById(int id){
		return customerRepository.findById(id).get();
			}
}
