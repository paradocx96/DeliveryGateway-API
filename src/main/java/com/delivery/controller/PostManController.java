package com.delivery.controller;

import com.delivery.model.PostMan;
import com.delivery.service.PostManService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*")
@RestController
@RequestMapping("/api/postman")
public class PostManController {

    // Declare a service class variable
    private final PostManService service;

    @Autowired
    public PostManController(PostManService service) {
        this.service = service;
    }

    @GetMapping
    public List<PostMan> getAll() {
        return service.getAll();
    }

    // Function for add new order to database
    @PostMapping("/add")
    public PostMan createUpdatePostMan(@RequestBody PostMan pm) {
        return service.savePostMan(pm);
    }

    // Function for get last added order
    @GetMapping("/last")
    public List<PostMan> getLastOrder() {
        return service.getLastOrder();
    }

}
