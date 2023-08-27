package com.example.demo.student;

public class Student {
    private Long id;
    private int age;
    private String name,email;
    private int dob;

    public Student(Long id, int age, String name, String email, int dob) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Student() {

    }

    public Student(int age, String name, String email, int dob) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
