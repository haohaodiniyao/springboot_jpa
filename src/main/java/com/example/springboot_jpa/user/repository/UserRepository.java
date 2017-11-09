package com.example.springboot_jpa.user.repository;

import com.example.springboot_jpa.user.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {
    @Modifying
    @Query("update User u set u.mount = ?1 where u.id = ?2")
    int updateUser(double mount,long id);
}