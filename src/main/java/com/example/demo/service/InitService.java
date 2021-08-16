package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitService {
    private final StudentService studentService;

    public InitService(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostConstruct
    public void initMethod(){
        Student student1= new Student("Oleg", "Smirnov", "405");
        studentService.save(student1);
        Student student2= new Student("Petr", "Ivanov", "4009");
        studentService.save(student2);
        Student student3= new Student("Jon", "Ivanov", "4009");
        studentService.save(student3);
    }


}
