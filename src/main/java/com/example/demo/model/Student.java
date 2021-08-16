package com.example.demo.model;

import com.sun.istack.NotNull;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "Last_name",nullable = false)
    private String LastName;
    @Column(name = "course_number",nullable = false)
    private String courseNumber;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String courseNumber) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.courseNumber = courseNumber;
    }

    public Student(String firstName, String lastName, String courseNumber) {
        this.firstName = firstName;
        LastName = lastName;
        this.courseNumber = courseNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
}
