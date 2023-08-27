package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@GetMapping
	public static List<Student> getD(String[] args) {
		return List.of(
				new Student(
						1L,
						22,
						"mohamed",
						"ibrahimohamed81@outlook.com",
						 LocalDate.of(2000, 01, 04)
				)
		);
	}

}
