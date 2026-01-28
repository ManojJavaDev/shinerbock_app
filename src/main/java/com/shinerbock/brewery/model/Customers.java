package com.shinerbock.brewery.model;

import jakarta.persistence.*;

@Table
@Entity
public class Customers {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long customerId;
    @Column
    public String customerName;

    @Column
    public String customerEmail;

    public Customers() {
    }

    public Customers(Long customerId, String customerName, String customerEmail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
