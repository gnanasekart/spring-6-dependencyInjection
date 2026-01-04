package com.tgs.spring6dependencyinjection.session2.Service;

import com.tgs.spring6dependencyinjection.session2.model.StudentCRUD;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicReference;

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
        if (students.isEmpty()) {
            return null;
        }

        int index=0;

        for (StudentCRUD student : students) {
            if (student.getRollNo() == rno) {
                return students.get(index);
            }
            index++;
        }
        return null;
    }

    public String addStudent(StudentCRUD student) {
        String message = "";
        if (student == null || student.getRollNo() == 0) {
            return "Student cannot be null";
        } else if( students.isEmpty()) {
            return "No students available to update.";
        }

        OptionalInt found = java.util.stream.IntStream.range(0, students.size())
                .filter(index -> students.get(index).getRollNo() == student.getRollNo())
                .findFirst();
        if (found.isPresent()) {
            message = "Student with roll number " + student.getRollNo() + " already exists.";
        } else {
            students.add(student);
            message = "Student added successfully.";
        }
        return message;
    }

    public String updateStudent(StudentCRUD student) {
        String message = "";
        if (student == null || student.getRollNo() == 0) {
            return "Student cannot be null.";
        } else if( students.isEmpty()) {
            return "No students available to update.";
        }

        OptionalInt found = java.util.stream.IntStream.range(0, students.size())
                .filter(i -> students.get(i).getRollNo() == student.getRollNo())
                .findFirst();

        if (found.isPresent()) {
            students.set(found.getAsInt(), student);
            message = "Student updated successfully.";
        } else {
            message = "Student with roll number " + student.getRollNo() + " not found.";
        }
        return message;
    }

    public String deleteStudent(int rno) {
        String message = "";
        if (students.isEmpty()) {
            return "No students available to delete.";
        }

        OptionalInt found = java.util.stream.IntStream.range(0, students.size())
                .filter(i -> students.get(i).getRollNo() == rno)
                .findFirst();
        if (found.isPresent()) {
            students.remove(found.getAsInt());
            message = "Student deleted successfully.";
        } else {
            message = "Student with roll number " + rno + " not found.";
        }
        return message;
    }
}
