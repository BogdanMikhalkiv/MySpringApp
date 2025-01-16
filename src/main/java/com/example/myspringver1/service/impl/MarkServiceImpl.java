package com.example.myspringver1.service.impl;

import com.example.myspringver1.model.Mark;
import com.example.myspringver1.repository.MarkRepository;
import com.example.myspringver1.service.MarkService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Primary
public class MarkServiceImpl implements MarkService {
    private final MarkRepository markRepository;


    @Override
    public List<Mark> getMarkList() {
        return markRepository.findAll();
    }

    @Override
    public List<Mark> getSortedMarkList() {
        return markRepository.getMarksOrderByMarkAsc();
    }

    @Override
    public Mark saveMark(Mark mark) {
        return markRepository.save(mark);
    }

    @Override
    public Mark findByIdMark(Long id) {
        return markRepository.findAllById(id);
    }

    @Override
    public Mark updateMark(Mark mark) {
        return markRepository.save(mark);
    }

    @Override
    public void deleteMark(Long id) {
        markRepository.deleteById(id);
    }
}
