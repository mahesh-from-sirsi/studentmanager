package com.mvs.studentmanager.student.chapter2;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InMemoryStudentService_chapter2 implements StudentService {

    private final InMemoryStudentDao_chapter2 dao;

    public InMemoryStudentService_chapter2(InMemoryStudentDao_chapter2 dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> findAllStudents() {
        return this.dao.findAllStudents();
    }

    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return this.dao.update(s);
    }

    @Override
    public void delete(String email) {
        this.dao.delete(email);
    }
}