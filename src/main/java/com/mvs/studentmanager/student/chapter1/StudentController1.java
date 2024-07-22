package com.mvs.studentmanager.student.chapter1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students1")
public class StudentController1 {

    @GetMapping
    public List<String> findAllStudents() {
        return List.of(
                "Mahesh",
                "Ramesh",
                "Ganesh",
                "Pranesh",
                "Suresh",
                "Veeresh"
        );
    }
}
