package com.mauricio.todoapp.service;

import com.mauricio.todoapp.mapper.TaskInDTOToTask;
import com.mauricio.todoapp.persistence.entity.Task;
import com.mauricio.todoapp.persistence.repository.TaskRepository;
import com.mauricio.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


    // Nota: aqui vamos a inyectar el repositorio.
    //       Para inyectar el repositorio hay varias formas con @AutoWired o aqui como se visualiza
    //       que no lo vamos a inyectar sino por constructor
    private final TaskRepository repositoty;

    // Aqui vamos a definir el mapper
    private final TaskInDTOToTask mapper;

    // Este constructor me lo genero cuando declare arriba rivate final TaskRepository repositoty;
    // que es otra forma como de inyectar dependencias pero de una me obliga a declarar el metodo
    // constructor que sigue. y el mapper se creo cuando definimos TaskInDTOToTask
    public TaskService(TaskRepository repositoty, TaskInDTOToTask mapper) {
        this.repositoty = repositoty;
        this.mapper = mapper;
    }

    // Aqui en el servicio se va a recibir el TaskInDTO
    public Task createTask(TaskInDTO taskinDTO){
        // Aqui se define task y recibe mapper y lo convierte
        Task task = mapper.map(taskinDTO);
        // Aqui ya tenemos el objeto Task mapeado mediante el mapper anterior
        return this.repositoty.save(task);
    }

    public List<Task> findall(){
        return repositoty.findAll();
    }


}
