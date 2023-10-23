package com.example.p21ntierarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/customers")
public class P21NTierArchitectureApplication {

    private final CustomerRepository customerRepository;

    public P21NTierArchitectureApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(P21NTierArchitectureApplication.class, args);
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }


    public record NewCustomerRequest(String name, String email, Integer age) {}

    @RequestMapping
    public void addCustomer(@RequestBody NewCustomerRequest newCustomerRequest) {
        Customer customer = new Customer();

        customer.setName(newCustomerRequest.name());
        customer.setEmail(newCustomerRequest.email());
        customer.setAge(newCustomerRequest.age());

        customerRepository.save(customer);
    }
}
