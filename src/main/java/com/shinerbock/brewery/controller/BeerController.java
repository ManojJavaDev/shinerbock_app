package com.shinerbock.brewery.controller;

import com.shinerbock.brewery.model.Beers;
import com.shinerbock.brewery.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;


@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @Autowired
    private final BeerService beerservice;

    public BeerController(BeerService beerservice) {
        this.beerservice = beerservice;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<Beers> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerservice.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping("/addnewbeer")
    public ResponseEntity<String> addBeer(@RequestBody Beers beer){
        try {
            System.out.println("Received beer: " + beer.getName() + ", " + beer.getStyle() + ", " + beer.getUpc());
            String status = beerservice.addNewBeer(beer);
            return new ResponseEntity<>(status, HttpStatus.CREATED);
        }catch(ResponseStatusException e){
            return new ResponseEntity<>(e.getMessage(), e.getStatusCode());
        }
    }


}
