package com.mvs.studentmanager.student.chapter1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students5")
public class StudentController5_Constructor_Injection_Without_Autowired {

    private StudentService1 studentService1;


    public StudentController5_Constructor_Injection_Without_Autowired(StudentService1 studentService1) {
        this.studentService1 = studentService1;
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService1.findAllStudents();
    }
}
