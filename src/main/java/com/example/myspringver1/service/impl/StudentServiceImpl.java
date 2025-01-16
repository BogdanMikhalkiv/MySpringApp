package com.example.myspringver1.service.impl;

import com.example.myspringver1.model.Student;
import com.example.myspringver1.repository.StudentRepository;
import com.example.myspringver1.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;
    @Override
    public List<Student> getStudentList() {
        return repository.findAll();
    }

    @Override
    public Double getAvgMark(Long id) {
        return repository.getAvgMark(id);
    }



    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByIdStudent(Long id) {
        return repository.findAllById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
