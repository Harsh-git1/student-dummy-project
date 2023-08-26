package com.example.studentdummyproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int regNo) {
        return studentRepository.getStudent(regNo);
    }

    public String putStudent(Student student) {
        return studentRepository.putStudent(student);
    }

    public Student updateStudentAge(int regNo, int age) {
        return studentRepository.updateStudentAge(regNo, age);
    }
}
