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

/**
 * The CustomerService interface provides the service for the customer.
 *
 * @author Bülent Barış Kılıç
 */
public interface CustomerService {

  List<Customer> getCustomers();

  void addCustomer(CustomerRequest request);

  void deleteCustomer(Integer id);

  void updateCustomer(Integer id, CustomerRequest request);
}
