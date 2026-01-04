package com.tgs.spring6dependencyinjection.sessionJpa.controller;

import com.tgs.spring6dependencyinjection.sessionJpa.model.Student;
import com.tgs.spring6dependencyinjection.sessionJpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{rno}")
    public  Student getStudent(@PathVariable("rno") int rno) {
        return studentService.getStudentByRno(rno);
    }

    @GetMapping("/students/technology/{tech}")
    public List<Student> getStudentsByTechnology(@PathVariable("tech") String technology) {
        return studentService.getStudentsByTechnology(technology);
    }

    @PostMapping("/students/filter")
    public List<Student> getStudentByGenderAndTechnology(@Param("gender") String gender,
                                                         @Param("technology") String technology) {
        return studentService.getStudentsByGenderAndTechnology(gender, technology);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody CreateStudentDTO dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setGender(dto.getGender());
        student.setTechnology(dto.getTechnology());
        return studentService.addStudent(student);
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "Student updated successfully";
    }

    @DeleteMapping("/students/{rno}")
    public String deleteStudent(@PathVariable("rno") int rno) {
        studentService.deleteStudent(rno);
        return "Student deleted successfully";
    }

    @DeleteMapping("/students/clear")
    public String deleteAllStudents() {
//        List<Student> students = studentService.getAllStudents();
//        for (Student student : students)
//            studentService.deleteStudent(student.getRno());
        studentService.deleteAllStudents();
        return "All students deleted successfully";
    }

}
