package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIMple implements StudentService{
    @Autowired
    StudentRepo repo;
    @Override
    public Student add(Student student) {
        return repo.save(student);
    }


}

