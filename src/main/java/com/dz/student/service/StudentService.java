package com.dz.student.service;

import com.dz.student.model.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    List<Student> findAll();
}
