package com.mvs.studentmanager.student.chapter1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students2")
public class StudentController2WithServiceAddedAsInstance {

    private StudentService1 studentService1 = new StudentService1();

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService1.findAllStudents();
    }
}
