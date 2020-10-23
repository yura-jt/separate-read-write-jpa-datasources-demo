package com.example.controller;

import com.example.handler.ResourceNotFoundException;
import com.example.model.Customer;
import com.example.service.CustomerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerControllerImpl {

    private final CustomerService customerService;

    public CustomerControllerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(path = "/customer/{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable("id") Long id) {

        return customerService.getCustomer(id).orElseThrow(() -> new ResourceNotFoundException("Invalid Customer"));
    }

    @RequestMapping(path = "/customer", method = RequestMethod.POST)
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

}
