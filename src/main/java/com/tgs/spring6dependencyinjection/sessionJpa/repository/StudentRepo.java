package com.tgs.spring6dependencyinjection.sessionJpa.repository;

import com.tgs.spring6dependencyinjection.sessionJpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
