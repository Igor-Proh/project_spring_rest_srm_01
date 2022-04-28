package com.prokhnov.spring.rest_srm.dao;

import com.prokhnov.spring.rest_srm.entity.Customer;

import java.util.List;


public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
