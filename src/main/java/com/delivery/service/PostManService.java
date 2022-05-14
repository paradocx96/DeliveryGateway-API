package com.delivery.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.model.PostMan;
import com.delivery.repo.PostManRepo;

@Service
public class PostManService {

    // Declare a repository interface variable
    PostManRepo postManRepo;

    @Autowired
    public PostManService(PostManRepo postManRepo) {
        this.postManRepo = postManRepo;
    }

    public List<PostMan> getAll() {
        return postManRepo.findAll();
    }

    public PostMan getByID(String id) {
        return postManRepo.findById(id).get();
    }

    public String deleteById(String id) {
        PostMan postMan = null;

        try {
            postMan = postManRepo.findById(id).get();
            if (postMan != null) {
                postManRepo.deleteById(id);
                return "Item delete success";
            } else {
                return "Item Does not exist";
            }
        } catch (NoSuchElementException e) {
            return "Item delete ERROR";
        }
    }

    public String updateModel(PostMan postMan) {
        PostMan local = null;

        try {
            local = postManRepo.findById(postMan.getId()).get();
            if (local != null) {
                postManRepo.save(postMan);
                return "Item update success";
            } else {
                return "Item Does not exist";
            }
        } catch (NoSuchElementException e) {
            return "Item update ERROR";
        }
    }

    // Implementation of add new Order to database
    public PostMan savePostMan(PostMan pm) {
        return postManRepo.save(pm);
    }

    // Implementation of get last Order data
    public List<PostMan> getLastOrder() {
        return postManRepo.findTopByOrderByIdDesc();
    }

}
