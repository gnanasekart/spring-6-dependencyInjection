package com.tgs.spring6dependencyinjection.sessionJpa.service;

import com.tgs.spring6dependencyinjection.sessionJpa.model.Student;
import com.tgs.spring6dependencyinjection.sessionJpa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Transactional
    public Student addStudent(Student student) {
        // Create a fresh managed entity - never use the passed-in detached entity directly
        Student managedStudent = new Student();
        managedStudent.setName(student.getName());
        managedStudent.setGender(student.getGender());
        managedStudent.setTechnology(student.getTechnology());

        // Only set rno if it doesn't already exist
        if (student.getRno() != null && !studentRepo.existsById(student.getRno())) {
            managedStudent.setRno(student.getRno());
        }

        return studentRepo.save(managedStudent);
    }

    @Transactional(readOnly = true)
    public Student getStudentByRno(Integer rno) {
        return studentRepo.findById(rno).orElse(null);
    }

    @Transactional
    public Student updateStudent(Student student) {
        if (student.getRno() == null) {
            throw new IllegalArgumentException("rno is required for update");
        }
        Student existing = studentRepo.findById(student.getRno()).orElseThrow();
        existing.setName(student.getName());
        existing.setGender(student.getGender());
        existing.setTechnology(student.getTechnology());
        return studentRepo.save(existing);
    }

    @Transactional
    public void deleteStudent(int rno) {
        studentRepo.deleteById(rno);
    }

    @Transactional
    public void deleteAllStudents() {
        studentRepo.deleteAll();
    }

    @Transactional(readOnly = true)
    public List<Student> getStudentsByTechnology(String technology) {
        return studentRepo.findByTechnology(technology);
    }

    @Transactional(readOnly = true)
    public List<Student> getStudentsByGenderAndTechnology(String gender, String technology) {
        return studentRepo.findByGenderAndTechnology(gender, technology);
    }

    @Transactional
    public Student addStudent(Integer rno, String name, String gender, String technology) {
        Student student = new Student();
        student.setName(name);
        student.setGender(gender);
        student.setTechnology(technology);

        // Only set rno if provided AND doesn't already exist
        if (rno != null && !studentRepo.existsById(rno)) {
            student.setRno(rno);
        }

        return studentRepo.save(student);
    }

    @Transactional
    public Student addStudent(String name, String gender, String technology) {
        Student student = new Student();
        student.setName(name);
        student.setGender(gender);
        student.setTechnology(technology);

        return studentRepo.save(student);
    }
}
