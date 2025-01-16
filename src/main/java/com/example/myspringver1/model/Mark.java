package com.example.myspringver1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Collection;

@Data
@Entity
@Table(name = "Marks")
public class Mark {
    @Id
    @GeneratedValue
    private  Long id;

    private Double mark;
    private LocalDate dateOfMark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

}
