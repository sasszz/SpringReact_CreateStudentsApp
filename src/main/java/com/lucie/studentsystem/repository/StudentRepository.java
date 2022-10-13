package com.lucie.studentsystem.repository;

import com.lucie.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
