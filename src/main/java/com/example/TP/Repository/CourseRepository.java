package com.example.TP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.TP.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}