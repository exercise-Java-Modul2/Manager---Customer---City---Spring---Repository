package com.codegym.service.customer;

import com.codegym.model.Customer;
import com.codegym.model.Province;

public interface CustomerService {

    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
