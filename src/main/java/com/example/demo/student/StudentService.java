package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

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
    @Transactional
    public void updateStudent(Long id, String name, String email) {
        // wanna check if name is null, empty and !equal to previous name
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                "student with id " + id + " doesnt not exist"
        ));
        if(name != null
                && name.length() > 0
                && !Objects.equals(student.getName(), name)
        ){
            student.setName(name);
        }

        if(email != null
                && email.length() > 0
                && !Objects.equals(student.getEmail(), email)
        ){
            student.setEmail(email);
        }
    }
}
