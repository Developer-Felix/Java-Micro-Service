package com.app.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public void registerCustomer(CustomerRegistrationRequest request){
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //Todo : Check if email taken
        //Todo : Check if email is valid
        //Todo : Store in The DB
    }
}
