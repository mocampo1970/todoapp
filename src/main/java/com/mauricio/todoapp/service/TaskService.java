package com.mauricio.todoapp.service;

import com.mauricio.todoapp.persistence.entity.Task;
import com.mauricio.todoapp.persistence.repository.TaskRepository;
import com.mauricio.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;

@Service
public class TaskService {


    // Nota: aqui vamos a inyectar el repositorio.
    //       Para inyectar el repositorio hay varias formas con @AutoWired o aqui como se visualiza
    //       que no lo vamos a inyectar sino por constructor
    private final TaskRepository repositoty;

    // Este constructor me lo genero cuando declare arriba rivate final TaskRepository repositoty;
    // que es otra forma como de inyectar dependencias pero de una me obliga a declarar el metodo
    // constructor que sigue.
    public TaskService(TaskRepository repositoty) {
        this.repositoty = repositoty;
    }

    // Aqui en el servicio se va a recibir el TaskInDTO
    public Task createTask(TaskInDTO taskinDTO){
        return null; //this.repositoty.save()
    }


}
