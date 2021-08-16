package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.Optional;

public interface StudentService {
    void save(Student student);
    Optional<Student> findById(int id);
    void deleteById(int id);
    Iterable<Student> getAllStudents();
}
