package com.mauricio.todoapp.persistence.repository;

import com.mauricio.todoapp.persistence.entity.Task;
import com.mauricio.todoapp.persistence.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Aqui necesitamos obtener las tareas por estado, podemos hacer un query.
    // vamos a hacer una consulta usando jpa, recibe un status
    public List<Task> findAllByTaskStatus(TaskStatus status);

    // Vamos a crear una consulta nativa y le vamos a pasar el query
    // le pasamos parametro y le marcamos con @Query que nos permite ejecutar querys en spring
    // con nativeQuery=true significa que se va a ejecutar en el gestor que se esta utilizando
    // ese @Modifying significa que es una query de actualizacion
    @Modifying
    @Query(value= "UPDATE TASK SET FINISHED=true WHERE ID=:id", nativeQuery = true)
    public void markTaskAsFinished(@Param("id") Long id);


}
