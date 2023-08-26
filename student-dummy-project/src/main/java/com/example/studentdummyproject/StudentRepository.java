package com.example.studentdummyproject;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer, Student> db = new HashMap<>();
    public Student getStudent(int regNo) {
        System.out.println("fncalled");
        return db.get(regNo);
    }

    public String putStudent(Student student) {
        db.put(student.getRegNo(), student);
        return "Student added Successfully";
    }

    public Student updateStudentAge(int regNo, int age) {
        db.get(regNo).setAge(age);
        return db.get(regNo);
    }
}
