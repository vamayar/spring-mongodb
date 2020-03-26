package com.mongo.test.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.test.app.model.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
	  Users findByUsername(String username);
	}