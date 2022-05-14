package com.delivery.repo;

import com.delivery.model.PostMan;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostManRepo extends MongoRepository<PostMan, String> {

    // Declare a function for get last order from database
    List<PostMan> findTopByOrderByIdDesc();


    List<PostMan> findFirstByOrderByIdDesc();
}
