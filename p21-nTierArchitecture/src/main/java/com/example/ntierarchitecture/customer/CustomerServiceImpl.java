/*
 * Copyright 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.ntierarchitecture.customer;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 * The CustomerServiceImpl class is the service implementation for the customer service.
 *
 * @author Bülent Barış Kılıç
 */
@Service
public class CustomerServiceImpl implements CustomerService {

  private final CustomerRepository customerRepository;

  CustomerServiceImpl(CustomerRepository repository) {
    this.customerRepository = repository;
  }

  @Override
  public List<Customer> getCustomers() {
    return this.customerRepository.findAll();
  }

  @Override
  public void addCustomer(CustomerRequest request) {
    final var customer = new Customer();
    customer.setName(request.name());
    customer.setEmail(request.email());
    customer.setAge(request.age());

    this.customerRepository.save(customer);
  }

  @Override
  public void deleteCustomer(Integer id) {
    this.customerRepository.deleteById(id);
  }

  @Override
  public void updateCustomer(Integer id, CustomerRequest request) {
    final var customer = this.customerRepository.findById(id).orElse(null);
    if (customer != null) {
      customer.setName(request.name());
      customer.setEmail(request.email());
      customer.setAge(request.age());
      this.customerRepository.save(customer);
    }
  }
}
