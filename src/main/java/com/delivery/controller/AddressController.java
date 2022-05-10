package com.delivery.controller;

import com.delivery.model.Address;
import com.delivery.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*")
@RestController
@RequestMapping("/api/address")
public class AddressController {

    // Declare a service class variable
    private final AddressService service;

    @Autowired
    public AddressController(AddressService service) {
        this.service = service;
    }

    @GetMapping
    public List<Address> getAllAddress() {
        return service.getAll();
    }

    // Function for get calculate delivery cost from service class
    @PostMapping("/calculate")
    public double calculateDeliveryCost(@RequestBody Address address) {
        return service.calDeliveryCost(address);
    }

    // Function for add new address to database
    @PostMapping("/add")
    public Address createUpdateAddress(@RequestBody Address address) {
        return service.saveAddress(address);
    }

}
