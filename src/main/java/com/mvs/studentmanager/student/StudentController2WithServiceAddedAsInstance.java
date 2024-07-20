package com.mvs.studentmanager.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students2")
public class StudentController2WithServiceAddedAsInstance {

    private StudentService studentService = new StudentService();

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }
}
