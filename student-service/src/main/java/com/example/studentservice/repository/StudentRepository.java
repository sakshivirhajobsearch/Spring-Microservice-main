package com.example.studentservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.studentservice.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
