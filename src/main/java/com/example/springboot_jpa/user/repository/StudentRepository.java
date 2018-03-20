package com.example.springboot_jpa.user.repository;

import com.example.springboot_jpa.user.entity.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends CrudRepository<Student, Long> {
    @Modifying
    @Query("update Student s set s.name = ?1 ,s.version = s.verion+1 where s.id = ?2 and s.version = ?3")
    @Transactional
    int updateNameById(String name, long id,long version);
}