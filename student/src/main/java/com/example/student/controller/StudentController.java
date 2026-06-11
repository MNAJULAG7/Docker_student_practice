package com.example.student.controller;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/students")
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping("/add")
    public ResponseEntity<Student> add(@RequestBody Student student)
    {
                    return ResponseEntity.ok().body(service.add(student));
    }
}
