package com.tgs.spring6dependencyinjection.sessionJpa.controller;

import com.tgs.spring6dependencyinjection.sessionJpa.model.Student;
import com.tgs.spring6dependencyinjection.sessionJpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{rno}")
    public  ResponseEntity<Student> getStudent(@PathVariable("rno") int rno) {
        Student student = studentService.getStudentByRno(rno);
        if (student == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
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
    public ResponseEntity<String> createStudent(@RequestBody CreateStudentDTO dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setGender(dto.getGender());
        student.setTechnology(dto.getTechnology());
        studentService.addStudent(student);
        return new ResponseEntity<>("Student created successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add/student")
    public ResponseEntity<String> addStudentWithRno(@RequestParam("rno") Integer rno,
                           @RequestParam("name") String name,
                           @RequestParam("gender") String gender,
                           @RequestParam("technology") String technology){
        studentService.addStudent(rno, name, gender, technology);
        return new ResponseEntity<>("Student added successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add/student/auto")
    public ResponseEntity<String> addStudentAutoRno(@RequestParam("name") String name,
                           @RequestParam("gender") String gender,
                           @RequestParam("technology") String technology){
        studentService.addStudent(name, gender, technology);
        return new ResponseEntity<>("Student added successfully", HttpStatus.CREATED);
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
