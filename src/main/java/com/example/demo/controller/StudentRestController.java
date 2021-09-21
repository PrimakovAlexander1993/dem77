package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }
    //addSome Change
    @GetMapping("/students")
    public ResponseEntity<Iterable<Student>> getAllStudents(){
        return ResponseEntity.ok().body(studentService.getAllStudents());
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable int id){
        return ResponseEntity.ok().body(studentService.findById(id));
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable int id){

        Optional<Student> student = studentService.findById(id);
        studentService.deleteById(id);
        return "Student with " + id + "was deleted";
    }
}
