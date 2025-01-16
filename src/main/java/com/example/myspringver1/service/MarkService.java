package com.example.myspringver1.service;

import com.example.myspringver1.model.Mark;
import com.example.myspringver1.model.Student;

import java.util.List;

public interface MarkService {

    List<Mark> getMarkList();
    List<Mark> getSortedMarkList();
    Mark saveMark(Mark mark);
    Mark findByIdMark (Long id);
    Mark updateMark(Mark mark);
    void deleteMark(Long id);
}
