package com.dz.student.controller;

import com.dz.student.model.Student;
import com.dz.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
   @GetMapping
   public String index(){
        return "Welcome to student service";
}
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
       return studentService.findAll();
    }

    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }
}
