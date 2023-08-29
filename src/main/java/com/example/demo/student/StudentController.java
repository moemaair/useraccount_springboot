package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    // create an object of studentService
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public  List<Student> getStudent() {
        return studentService.getStudent();
    }

    @PostMapping("register")
    public Student registerNewStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

}
