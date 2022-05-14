package com.delivery.controller;

import com.delivery.model.PostMan;
import com.delivery.service.PostManService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*")
@RestController
@RequestMapping("/api/postman")
public class PostManController {

    private final PostManService service;

    @Autowired
    public PostManController(PostManService service) {
        this.service = service;
    }

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<PostMan> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PostMan getPostmanById(@PathVariable String id) {
        return service.getByID(id);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deletePostmanById(@PathVariable String id) {
        return service.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public String updatePostman(@RequestBody PostMan postMan) {
        return service.updateModel(postMan);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public PostMan createPostMan(@RequestBody PostMan pm) {
        return service.savePostMan(pm);
    }

    @GetMapping("/last")
    @ResponseStatus(HttpStatus.OK)
    public List<PostMan> getLastOrder() {
        return service.getLastOrder();
    }
}
