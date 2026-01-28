package com.shinerbock.brewery.services;

import com.shinerbock.brewery.model.Beers;
import com.shinerbock.brewery.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    @Autowired
    BeerRepository beerRepository;

    @Override
    public Beers getBeerById(UUID beerId) {
        return (Beers) beerRepository.findById(beerId).orElse(null);
    }

    @Override
    public String addNewBeer(Beers beer) {
        if(beer != null){
            beerRepository.save(beer);
            return "New beer added successfully";
        } else {
            return "Failed to add new beer";
        }
    }

}

