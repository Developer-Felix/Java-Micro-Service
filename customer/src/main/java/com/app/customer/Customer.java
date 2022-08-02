package com.app.customer;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Builder
@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String email;

}
