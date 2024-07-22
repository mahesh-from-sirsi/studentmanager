package com.mvs.studentmanager.student.chapter2;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PostMapping
    public Student save(@RequestBody Student s) {
        return studentService.save(s);
    }

    @PutMapping
    public Student update(@RequestBody Student s) {
        return studentService.update(s);
    }

    @GetMapping("/{email}")
    public Student findStudentByEmail(@PathVariable String email) {
        return studentService.findByEmail(email);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable String email) {
        studentService.delete(email);
    }

}
