package com.example.myspringver1.controller;

import com.example.myspringver1.model.Student;
import com.example.myspringver1.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping()
    public List<Student> getStudents(){
        return service.getStudentList();
    }

    @GetMapping("avgMark/{id}")
    public String getAvgMark(@PathVariable Long id) {

        Student student = findByIdStudent(id);
        System.out.println("student - " +student);
        if (student == null) {
            return "no student by this id:" + id;
        }

        Double avgMark = service.getAvgMark(id);
        System.out.println("avg mark - " + avgMark);
        if (avgMark == null) {
            return "no marks by this student id:" + id;
        }

        return "avg mark - " + avgMark ;
    }

    @PostMapping("add_student")
    public String saveStudent(@RequestBody Student student) {
         service.saveStudent(student);
         return "Student was added";
    }
    @GetMapping("/{id}")
    public Student findByIdStudent (@PathVariable Long id) {
        return service.findByIdStudent(id);
    }
    @PutMapping("update_student")
    public String updateStudent(@RequestBody Student student) {
        service.updateStudent(student);
        return " student was modified";
    }

    @DeleteMapping("delete_student/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }


}
