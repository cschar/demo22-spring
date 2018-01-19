package com.example.demo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface MooFooCustomerRepository extends CrudRepository<MooFooCustomer, Long> {
	public List<MooFooCustomer> findAll();
}


