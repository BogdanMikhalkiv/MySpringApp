package com.example.myspringver1.controller;

import com.example.myspringver1.model.Mark;
import com.example.myspringver1.model.Subject;
import com.example.myspringver1.service.MarkService;
import com.example.myspringver1.service.SubjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/subjects")
@AllArgsConstructor
public class SubjectController {
    private final SubjectService service;

    @GetMapping()
    public List<Subject> getSubjects(){
        System.out.println("гэт работает");
        return service.getSubjectList();
    }

    @PostMapping("add_subject")
    public String saveSubject(@RequestBody Subject subject) {
        System.out.println("работает до");
        service.saveSubject(subject);
        System.out.println("работает после ");
        return "subject was added";
    }
    @GetMapping("/{id}")
    public Subject findByIdSubject (@PathVariable Long id) {
        return service.findByIdSubject(id);
    }
    @PutMapping("update_subject")
    public String updateSubject(@RequestBody Subject subject) {
        service.updateSubject(subject);
        return " subject was modified";
    }

    @DeleteMapping("delete_subject/{id}")
    public void deleteSubject(@PathVariable Long id) {
        service.deleteSubject(id);
    }
}
