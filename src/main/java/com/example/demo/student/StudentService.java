package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

   private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
       return studentRepository.save(student);
    }

    public String fetchStudentById(Long id) {
        return studentRepository.findById(id).get().getName().toString();
    }

    public void deleteStudent(Long id) {
      boolean exists = studentRepository.existsById(id);

      if(!exists){
          throw new IllegalStateException(
                  "student with id" + id + "does not exist"
          );

      }
      studentRepository.deleteById(id);
 
    }
}
