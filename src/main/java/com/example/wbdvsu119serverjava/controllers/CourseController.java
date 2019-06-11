package com.example.wbdvsu119serverjava.controllers;

import com.example.wbdvsu119serverjava.models.Course;
import com.example.wbdvsu119serverjava.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CourseController {
    @Autowired
    CourseRepository repository;

    @GetMapping("/api/courses")
    public List<Course> findAllCourses() {
        return (List<Course>)repository.findAll();
    }
}
