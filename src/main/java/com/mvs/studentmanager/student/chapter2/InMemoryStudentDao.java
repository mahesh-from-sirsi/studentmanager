package com.mvs.studentmanager.student.chapter2;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {

    final List<Student> STUDENTLIST = new ArrayList<>();

    public List<Student> findAllStudents() {
        return STUDENTLIST;
    }

    public Student save(Student s) {
        STUDENTLIST.add(s);
        return s;
    }

    public Student findByEmail(String email) {
        return STUDENTLIST.stream()
            .filter(s -> email.equals(s.getEmail()))
            .findFirst()
            .orElse(null);
    }

    public Student update(Student s) {
        var studentIndex = IntStream.range(0, STUDENTLIST.size())
                .filter(index -> STUDENTLIST.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);

        if (studentIndex != -1) {
            STUDENTLIST.set(studentIndex, s);
            return s;
        }
        return null;
    }

    public void delete(String email) {
        var student = findByEmail(email);
        if (student != null) {
            STUDENTLIST.remove(student);
        }
    }
}
