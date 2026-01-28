package com.shinerbock.brewery.services;

import com.shinerbock.brewery.dto.CustomerRequest;
import com.shinerbock.brewery.model.Customers;
import com.shinerbock.brewery.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    CustomerRepository  customerRepository;

    @Override
    public Customers getCustomerById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customers saveNewCustomer(CustomerRequest customerRequest) {
        Customers customer = new Customers();
        customer.setCustomerName(customerRequest.getCustomerName());
        customer.setCustomerEmail(customerRequest.getCustomerEmail());

        return customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Integer id, Customers customer) {

    }

    @Override
    public void deleteCustomerById(Integer id) {

    }
}
