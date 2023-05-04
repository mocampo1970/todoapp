package com.mauricio.todoapp.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tittle;
    private String description;

    private LocalDateTime createdDate;

    private LocalDateTime eta;  // ese nombre se usa para fecha de terminación estimada y se usa bastante

    private boolean finished;

    private TaskStatus taskStatus;



}
