package com.mauricio.todoapp.controller;

import com.mauricio.todoapp.persistence.entity.Task;
import com.mauricio.todoapp.service.TaskService;
import com.mauricio.todoapp.service.dto.TaskInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RequestMapping define el camino de nuestro controlador
@RestController
@RequestMapping("/tasks")
public class TaskController {

    // Este señor no inyecta el servicio sino que lo define por eso abajo solicita el constructor
    private final TaskService taskservice;

    public TaskController(TaskService taskservice) {
        this.taskservice = taskservice;
    }

    @PostMapping
    public Task createTask(@RequestBody TaskInDTO taskInDTO){
        return this.taskservice.createTask(taskInDTO);
    }

}
