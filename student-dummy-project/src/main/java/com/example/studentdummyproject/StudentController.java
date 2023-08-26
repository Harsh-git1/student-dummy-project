package com.example.studentdummyproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo) {
        return studentService.getStudent(regNo);
    }

    @PostMapping("/add")
    public String putStudent(@RequestBody Student student) {

        return studentService.putStudent(student);
    }

//    @GetMapping("/getByPath/{id}")
//    public Student getStudentByPath(@PathVariable("id") int regNo) {
//        return studentService.getStudentByPath(regNo);
//    }

    @PutMapping("/update-age/{id}")
    public Student updateStudentAge(@PathVariable("id") int regNo , @RequestParam("age") int age){
        return studentService.updateStudentAge(regNo, age);
    }

//    @DeleteMapping("/remove")
//    public String deleteStudent(@RequestParam("d") int regNo) {
//        db.remove(regNo);
//        return "Student removed successfully";
//    }


}
