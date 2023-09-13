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

    @GetMapping("/student/{id}")
    public String fetchStudentById(@PathVariable("id") Long id){
        return studentService.fetchStudentById(id);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
         studentService.deleteStudent(id);
    }


    @DeleteMapping("/delete")
    public void deleteStudentAll(){
        studentService.deleteStudentAll();
    }

    @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable("id") Long id,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email
    ){
        studentService.updateStudent(id,name,email);
    }
}
