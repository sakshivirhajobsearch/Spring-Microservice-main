package com.example.schoolservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.schoolservice.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer> {
}
