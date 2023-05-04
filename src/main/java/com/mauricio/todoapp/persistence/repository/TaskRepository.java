package com.mauricio.todoapp.persistence.repository;

import com.mauricio.todoapp.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
