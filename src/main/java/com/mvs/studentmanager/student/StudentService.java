package com.mvs.studentmanager.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student("Mahesh", "Shet", LocalDate.of(1974, 9, 26), "contact@maheshvshet.com", 50),
                new Student("Rajesh", "Kanna", LocalDate.of(1992, 9, 15), "contact@rajeshkannan.com", 35)
        );
    }
}
