package com.delivery.controller;

import com.delivery.model.Address;
import com.delivery.service.AddressService;

import io.swagger.annotations.ApiOperation;
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
    @ApiOperation("Get All Address")
    public List<Address> getAllAddress() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Get Address by Address ID")
    public Address getById(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Delete Address by Address ID")
    public String deleteById(@PathVariable String id) {
        return service.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Update Address")
    public String updateAddress(@RequestBody Address address) {
        return service.updateAddress(address);
    }

    @PostMapping("/calculate")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Calculate Delivery Cost for Address")
    public double calculateDeliveryCost(@RequestBody Address address) {
        return service.calDeliveryCost(address);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Address")
    public Address createAddress(@RequestBody Address address) {
        return service.saveAddress(address);
    }

}
