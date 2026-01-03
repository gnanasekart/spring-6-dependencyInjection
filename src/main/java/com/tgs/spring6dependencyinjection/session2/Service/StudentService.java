package com.tgs.spring6dependencyinjection.session2.Service;

import com.tgs.spring6dependencyinjection.session2.model.StudentCRUD;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<StudentCRUD> students = new ArrayList<>(
            Arrays.asList(
                    new StudentCRUD(1, "John Doe", "AI"),
                    new StudentCRUD(2, "Jane Smith", "IT"),
                    new StudentCRUD(3, "Alice Johnson", "CSE")
            )
    );

    public List<StudentCRUD> getAllStudents() {
        return students;
    }

    public StudentCRUD getStudentByRno(int rno) {
        int index=0;

        for (StudentCRUD student : students) {
            if (student.getRollNo() == rno) {
                return students.get(index);
            }
            index++;
        }
        return null;
    }

    public void addStudent(StudentCRUD student) {
        students.add(student);
    }
}
