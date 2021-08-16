package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
