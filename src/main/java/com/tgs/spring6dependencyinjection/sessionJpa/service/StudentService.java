package com.tgs.spring6dependencyinjection.sessionJpa.service;

import com.tgs.spring6dependencyinjection.sessionJpa.model.Student;
import com.tgs.spring6dependencyinjection.sessionJpa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student getStudentByRno(Integer rno) {
        return studentRepo.findById(rno).orElse(null);
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public void deleteStudent(int rno) {
        studentRepo.deleteById(rno);
    }

    public void deleteAllStudents() {
        studentRepo.deleteAll();
    }
}
