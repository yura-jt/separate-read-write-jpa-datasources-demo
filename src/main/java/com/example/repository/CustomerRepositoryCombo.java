package com.example.repository;

import com.example.repository.readRepository.CustomerReadRepository;
import com.example.repository.writeRepository.CustomerWriteRepository;

public interface CustomerRepositoryCombo extends CustomerReadRepository, CustomerWriteRepository {

}
