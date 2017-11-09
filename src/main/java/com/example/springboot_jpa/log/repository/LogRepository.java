package com.example.springboot_jpa.log.repository;

import com.example.springboot_jpa.log.entity.Log;
import com.example.springboot_jpa.user.entity.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface LogRepository extends CrudRepository<Log, Long> {

}