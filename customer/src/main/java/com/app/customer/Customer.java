package com.app.customer;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

@Data
@Builder
//@Data
//@Entity
//@Table(name = "customer")
//@NoArgsConstructor
public class Customer {
//    @Id
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String email;

}
