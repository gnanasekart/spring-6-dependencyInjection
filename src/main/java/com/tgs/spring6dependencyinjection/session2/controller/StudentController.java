package com.tgs.spring6dependencyinjection.session2.controller;

import com.tgs.spring6dependencyinjection.session2.Service.StudentService;
import com.tgs.spring6dependencyinjection.session2.model.StudentCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<StudentCRUD> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("student/{rno}")
    public StudentCRUD getStudentByRno(@PathVariable("rno") int rno) {
        return studentService.getStudentByRno(rno);
    }

    @PostMapping("student")
    public String addStudent(@RequestBody StudentCRUD student) {
        studentService.addStudent(student);
        return "Student added successfully";
    }


}
