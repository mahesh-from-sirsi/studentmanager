package com.mvs.studentmanager.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String email;

    private int age;
}
