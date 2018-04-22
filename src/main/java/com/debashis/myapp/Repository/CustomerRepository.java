package com.debashis.myapp.Repository;

import java.util.List;

import com.debashis.myapp.Domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
