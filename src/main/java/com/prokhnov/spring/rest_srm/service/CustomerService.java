package com.prokhnov.spring.rest_srm.service;

import com.prokhnov.spring.rest_srm.entity.Customer;

import java.util.List;


public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
