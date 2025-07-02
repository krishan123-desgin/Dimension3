package com.example.payment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @PostMapping
    public String pay() {
        // Simulate payment success
        return "OK";
    }
}
