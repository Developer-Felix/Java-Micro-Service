package com.app.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public record CustomerController(CustomerService customerService) {

    @PostMapping("/customer")
    public void registerCustomer(@RequestBody  CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("New Customer Registration {}",customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }

    @GetMapping("/customers")
    public List<String> getAllCustomers() {
//        return  List.of(new Customer(
//                1,
//                "Felix",
//                "Onjomba",
//                "onjombafelix1@gmail.com"
//        ),
//                new Customer(
//                        2,
//                        "Alex",
//                        "Aminga",
//                        "alexaminga1@gmail.com"
//                )
//        );
        return List.of("test", "test", "test", "test", "test", "test");
    }
}
