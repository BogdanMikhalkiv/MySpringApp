package com.example.myspringver1.controller;

import com.example.myspringver1.model.Mark;
import com.example.myspringver1.model.Student;
import com.example.myspringver1.service.MarkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/marks")
@AllArgsConstructor
public class MarkController {

    private final MarkService service;

    @GetMapping()
    public List<Mark> getMarks(){
        System.out.println("работает до");

        return service.getMarkList();
    }

    @GetMapping("sorted")
    public List<Mark> getSortedMarks(){
        return service.getSortedMarkList();
    }


    @PostMapping("add_mark")
    public String saveMark(@RequestBody Mark mark) {
        service.saveMark(mark);
        return "Mark was added";
    }
    @GetMapping("/{id}")
    public Mark findByIdMark (@PathVariable Long id) {
        return service.findByIdMark(id);
    }
    @PutMapping("update_mark")
    public String updateMark(@RequestBody Mark mark) {
        service.updateMark(mark);
        return " mark was modified";
    }

    @DeleteMapping("delete_mark/{id}")
    public void deleteMark(@PathVariable Long id) {
        service.deleteMark(id);
    }

}
