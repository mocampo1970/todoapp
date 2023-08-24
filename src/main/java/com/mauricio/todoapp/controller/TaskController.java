package com.mauricio.todoapp.controller;

import com.mauricio.todoapp.persistence.entity.Task;
import com.mauricio.todoapp.persistence.entity.TaskStatus;
import com.mauricio.todoapp.service.TaskService;
import com.mauricio.todoapp.service.dto.TaskInDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<Task> findAll(){
        return taskservice.findall();
    }

    // esta es una vble
    @GetMapping("status/{status}")
    public List<Task> findAllByStatus(@PathVariable("status") TaskStatus status){
        return taskservice.findAllByStatus(status);
    }

    // Vamos a actualizar lo ideal es que se busque un verbo que haga esto.
    @PatchMapping("/mark_as_finished/{id}")
    public ResponseEntity<Void> markAsFinished(@PathVariable ("id") Long id){
        this.taskservice.updateTaskAsFinished(id);
        // Esta instruccion lo que esta diciendo es que siempre 204 como para que la persona que
        // consume la api no se quede esperando
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ("id") Long id){
        this.taskservice.DeleteById(id);
        // Esta instruccion lo que esta diciendo es que siempre 204 como para que la persona que
        // consume la api no se quede esperando
        return ResponseEntity.noContent().build();
    }

}
