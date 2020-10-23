package com.example.service;

import com.example.model.Customer;

import java.util.Optional;

public interface CustomerService {

    Optional<Customer> getCustomer(Long id);

    Customer createCustomer(Customer customer);

}
