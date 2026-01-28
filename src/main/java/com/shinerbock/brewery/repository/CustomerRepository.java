package com.shinerbock.brewery.repository;

import com.shinerbock.brewery.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {
}
