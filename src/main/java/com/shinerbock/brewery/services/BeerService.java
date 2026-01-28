package com.shinerbock.brewery.services;

import com.shinerbock.brewery.model.Beers;

import java.util.UUID;

public interface BeerService {

    Beers getBeerById(UUID beerId);

    String addNewBeer(Beers beer);
}
