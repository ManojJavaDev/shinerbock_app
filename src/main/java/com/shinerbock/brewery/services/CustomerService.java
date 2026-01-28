package com.shinerbock.brewery.services;

import com.shinerbock.brewery.dto.CustomerRequest;
import com.shinerbock.brewery.model.Customers;

public interface CustomerService {

    public Customers getCustomerById(Integer id);

    public Customers saveNewCustomer(CustomerRequest customerRequest);

    public void updateCustomer(Integer id, Customers customer);

    public void deleteCustomerById(Integer id);
}
