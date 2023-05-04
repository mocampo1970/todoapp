package com.mauricio.todoapp.service.dto;



import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInDTO {

    private String tittle;
    private String description;

    private LocalDateTime eta;  // ese nombre se usa para fecha de terminación estimada y se usa bastante

}
