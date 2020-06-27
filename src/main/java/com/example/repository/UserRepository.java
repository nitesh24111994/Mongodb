package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.document.Users;

public interface UserRepository extends MongoRepository<Users,Integer>{
    
}
