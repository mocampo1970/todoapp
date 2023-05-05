package com.mauricio.todoapp.mapper;

import com.mauricio.todoapp.persistence.entity.Task;
import com.mauricio.todoapp.persistence.entity.TaskStatus;
import com.mauricio.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

// Esta clase nos convierte el TaskInDTO a Task
// Clase que me va a servir para mapear datos de un DTO que no lleva todos los campos a una entidad
// en este caso TaskIn
// Tenemos que enviarle el origen y destino en este caso el DTO es la entrada y la salida es Task la entidad
// Le colocamos @Component para poderlo inyectar
@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task>{

    // Significa que nos va a devolver el Task que es la entidad y le vamos a pasar el TaskInDTO que es el DTO
    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();

        // Mapeamos los campos que envia el DTO
        task.setTittle(in.getTittle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());

        // Ahora asignamos los campos que no estan en el DTO pero si en la entidad
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);

        // enviamos la tarea
        return task;
    }
}