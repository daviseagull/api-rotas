package com.lab.engenharia.apirotas.repository;

import com.lab.engenharia.apirotas.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
