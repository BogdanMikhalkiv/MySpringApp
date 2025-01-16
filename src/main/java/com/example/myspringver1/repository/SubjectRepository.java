package com.example.myspringver1.repository;

import com.example.myspringver1.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject findAllById(Long id);
}

