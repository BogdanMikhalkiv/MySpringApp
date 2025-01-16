package com.example.myspringver1.repository;

import com.example.myspringver1.model.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarkRepository extends JpaRepository<Mark, Long> {
    Mark findAllById(Long id);

    @Query("Select m from Mark m order by m.mark ASC ")
    List<Mark> getMarksOrderByMarkAsc();
}
