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

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.util.Objects;

/**
 * The Customer class represents the customer.
 *
 * @author Bülent Barış Kılıç
 */
@Entity
public class Customer {

  @Id
  @SequenceGenerator(name = "customer_id_sequence", sequenceName = "customer_id_sequence",
      allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_sequence")
  private Integer id;
  private String name;
  private String email;
  private Integer age;

  public Customer() {
  }

  /**
   * Constructs a new Customer with the given parameters.
   *
   * @param id    the id of the customer
   * @param name  the name of the customer
   * @param email the email of the customer
   * @param age   the age of the customer
   */
  public Customer(Integer id, String name, String email, Integer age) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.age = age;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final var customer = (Customer) o;
    return Objects.equals(this.id, customer.id) && Objects.equals(this.name, customer.name)
        && Objects.equals(this.email, customer.email) && Objects.equals(this.age, customer.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.email, this.age);
  }

  @Override
  public String toString() {
    return "Customer{"
        + "id=" + this.id
        + ", name='" + this.name + '\''
        + ", email='" + this.email + '\''
        + ", age=" + this.age
        + '}';
  }
}
