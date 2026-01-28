package com.shinerbock.brewery.dto;

import java.beans.JavaBean;

@JavaBean
public class CustomerRequest {

    public String customerName;
    public String customerEmail;

    public CustomerRequest() {
    }

    public CustomerRequest(String customerName, String customerEmail) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
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
