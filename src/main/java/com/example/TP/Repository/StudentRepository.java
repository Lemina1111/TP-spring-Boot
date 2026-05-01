package com.example.TP.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.TP.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContainingIgnoreCase(String name);
}