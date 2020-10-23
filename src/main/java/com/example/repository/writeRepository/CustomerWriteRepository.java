package com.example.repository.writeRepository;

import com.example.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerWriteRepository extends CrudRepository<Customer, Long> {
}
