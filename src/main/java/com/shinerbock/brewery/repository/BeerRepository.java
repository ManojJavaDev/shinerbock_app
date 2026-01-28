package com.shinerbock.brewery.repository;

import com.shinerbock.brewery.model.Beers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;


public interface BeerRepository extends JpaRepository<Beers, Integer>{
    Optional<Object> findById(UUID beerId);
}
