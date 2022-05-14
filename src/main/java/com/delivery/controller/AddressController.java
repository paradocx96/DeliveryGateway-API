package com.delivery.controller;

import com.delivery.model.Address;
import com.delivery.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*")
@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService service;

    @Autowired
    public AddressController(AddressService service) {
        this.service = service;
    }

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<Address> getAllAddress() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Address getById(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteById(@PathVariable String id) {
        return service.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public String updateAddress(@RequestBody Address address) {
        return service.updateAddress(address);
    }

    @PostMapping("/calculate")
    @ResponseStatus(HttpStatus.OK)
    public double calculateDeliveryCost(@RequestBody Address address) {
        return service.calDeliveryCost(address);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Address createAddress(@RequestBody Address address) {
        return service.saveAddress(address);
    }

}
