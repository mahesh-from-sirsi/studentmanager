package com.mvs.studentmanager.student.chapter3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DBStudentService implements StudentService {

    private StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAllStudents() {
        return this.repository.findAll();
    }

    @Override
    public Student save(Student s) {
        return this.repository.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return this.repository.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return this.repository.save(s);
    }

    @Override
    public void delete(String email) {
        this.repository.deleteByEmail(email);
    }
}
