package com.mvs.studentmanager.student.chapter3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    // Here we are defining a find by method and spring will create a
    // Query to find the entity that matches the filter
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
