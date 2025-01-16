package com.example.myspringver1.service;

import com.example.myspringver1.model.Student;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 public interface StudentService {


     List<Student> getStudentList();
     Double getAvgMark(Long id);
    Student saveStudent(Student student);
    Student findByIdStudent (Long id);
     Student updateStudent(Student student);
    void deleteStudent(Long id);
}
