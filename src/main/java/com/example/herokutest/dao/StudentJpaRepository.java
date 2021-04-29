package com.example.herokutest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.herokutest.model.Student;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Long>{

}
