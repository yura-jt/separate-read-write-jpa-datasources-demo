package com.example.repository.readRepository;

import com.example.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerReadRepository extends CrudRepository<Customer, Long> {
}
