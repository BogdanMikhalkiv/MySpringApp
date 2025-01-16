package com.example.myspringver1.service;

import com.example.myspringver1.model.Student;
import com.example.myspringver1.model.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getSubjectList();
    Subject saveSubject(Subject subject);
    Subject findByIdSubject (Long id);
    Subject updateSubject(Subject subject);
    void deleteSubject(Long id);
}
