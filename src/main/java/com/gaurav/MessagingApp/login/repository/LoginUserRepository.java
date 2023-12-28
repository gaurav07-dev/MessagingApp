package com.gaurav.MessagingApp.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.MessagingApp.login.entity.User;

@Repository
public interface LoginUserRepository extends MongoRepository<User, String> {

}
