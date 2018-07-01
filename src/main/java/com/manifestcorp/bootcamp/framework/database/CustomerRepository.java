package com.manifestcorp.bootcamp.framework.database;

import com.manifestcorp.bootcamp.framework.database.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
