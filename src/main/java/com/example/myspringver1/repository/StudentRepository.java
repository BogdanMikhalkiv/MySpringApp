package com.example.myspringver1.repository;

import com.example.myspringver1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository  extends JpaRepository<Student, Long> {
    Student findAllById(Long id);

    @Query("Select AVG(m.mark) from Mark m where m.student.id = :id")
    Double getAvgMark(@Param("id") Long id);
}
