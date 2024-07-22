package com.mvs.studentmanager.student.chapter1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students3")
public class StudentController3_WithAutowired_At_FieldLevel_Injection {

    @Autowired
    private StudentService1 studentService1;

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService1.findAllStudents();
    }
}
