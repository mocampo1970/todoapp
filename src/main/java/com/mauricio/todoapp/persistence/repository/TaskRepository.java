package com.mauricio.todoapp.persistence.repository;

import com.mauricio.todoapp.persistence.entity.Task;
import com.mauricio.todoapp.persistence.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Aqui necesitamos obtener las tareas por estado, podemos hacer un query.
    // vamos a hacer una consulta usando jpa
    //private List<Task> findAllByTaskStatus(TaskStatus status);


}
