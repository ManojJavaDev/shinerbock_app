package com.shinerbock.brewery.controller;

import com.shinerbock.brewery.dto.CustomerRequest;
import com.shinerbock.brewery.model.Customers;
import com.shinerbock.brewery.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/{id}")
    public Customers getCustomerById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/newCustomer")
    public ResponseEntity<Customers> saveNewCustomer(@RequestBody CustomerRequest customerRequest) {
       return ResponseEntity.ok(customerService.saveNewCustomer(customerRequest));
    }

    @PutMapping("/updateCustomer/{id}")
    public void updateCustomer(@PathVariable Integer id, @RequestBody Customers customer) {

    }

    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteCustomerById(Integer id) {

    }
}
