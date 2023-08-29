package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {


    // CommandLineRunner will be used to execute the code after the Spring Boot application started.
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            // creating students
            Student mariam = new  Student(
                    "Mariam",
                    "mariam334@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 4)
            );

            Student mohamed = new  Student(
                    "mohamed",
                    "ibrahimohamed81@outlook.com",
                    LocalDate.of(2000, Month.FEBRUARY, 4)
            );
            studentRepository.saveAll(
                    // saving to database
                    List.of(
                            mariam, mohamed
                    )
            );
        };
    }
}
