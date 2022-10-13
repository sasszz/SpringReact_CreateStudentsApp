package com.lucie.studentsystem.controller;

import com.lucie.studentsystem.model.Student;
import com.lucie.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return null;
    }

    @GetMapping("/getAll")
        public List<Student> getAllStudents(){
            return studentService.getAllStudents();
        }
    }


