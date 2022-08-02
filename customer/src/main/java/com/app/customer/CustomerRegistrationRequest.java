package com.app.customer;

public record CustomerRegistrationRequest(
        String firstName, String lastName, String email
) {}
