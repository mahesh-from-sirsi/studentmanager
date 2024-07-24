package com.mvs.studentmanager.student.chapter3;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    private int id;

    @Column // this is optional
    private String firstName;

    @Column // this is optional
    private String lastName;

    @Column // this is optional
    private LocalDate dateOfBirth;

    @Column(unique = true)
    private String email;

    @Transient
    private int age;

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
