package com.example.myspringver1.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import java.util.Set;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue
    private  Long id;

    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Mark> marks;

    public Long getId() {
        return id;
    }




}
