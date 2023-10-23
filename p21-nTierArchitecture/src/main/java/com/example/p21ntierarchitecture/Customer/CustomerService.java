package com.example.p21ntierarchitecture.Customer;

import java.util.List;

interface CustomerService {
    List<Customer> getCustomers();

    void addCustomer(CustomerRequest request);

    void deleteCustomer(Integer id);

    void updateCustomer(Integer id, CustomerRequest request);
}
