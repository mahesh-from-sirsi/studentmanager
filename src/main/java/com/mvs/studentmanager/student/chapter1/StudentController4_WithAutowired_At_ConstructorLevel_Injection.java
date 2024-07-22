package com.mvs.studentmanager.student.chapter1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students4")
public class StudentController4_WithAutowired_At_ConstructorLevel_Injection {

    private StudentService1 studentService1;

    @Autowired
    public StudentController4_WithAutowired_At_ConstructorLevel_Injection(StudentService1 studentService1) {
        this.studentService1 = studentService1;
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService1.findAllStudents();
    }
}
