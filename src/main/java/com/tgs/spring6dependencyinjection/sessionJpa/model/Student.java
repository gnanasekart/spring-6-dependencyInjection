package com.tgs.spring6dependencyinjection.sessionJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rno;
    private String name;
    private String gender;
    private String technology;

    public Student(Integer rno, String name, String gender, String technology) {
        this.rno = rno;
        this.name = name;
        this.gender = gender;
        this.technology = technology;
    }

    public Student(String name, String gender, String technology) {
        this.name = name;
        this.gender = gender;
        this.technology = technology;
    }
}
