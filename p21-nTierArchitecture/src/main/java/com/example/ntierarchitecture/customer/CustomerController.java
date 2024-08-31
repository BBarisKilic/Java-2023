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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The CustomerController class that provides APIs to handle customer operations.
 *
 * @author Bülent Barış Kılıç
 */
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping
  public List<Customer> getCustomers() {
    return this.customerService.getCustomers();
  }

  @PostMapping
  public void addCustomer(@RequestBody CustomerRequest request) {
    this.customerService.addCustomer(request);
  }

  @DeleteMapping("{customerId}")
  public void deleteCustomer(@PathVariable("customerId") Integer id) {
    this.customerService.deleteCustomer(id);
  }

  @PutMapping("{customerId}")
  public void updateCustomer(@PathVariable("customerId") Integer id,
      @RequestBody CustomerRequest request) {
    this.customerService.updateCustomer(id, request);
  }
}
