package com.mauricio.todoapp.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

// Se crea esta clase para hacer aqui las excepciones, extienden de RuntimeException
@Data
public class ToDoExceptions extends RuntimeException{

    private String message;
    private HttpStatus httpStatus;

    // Este metodo lo traemos de arriba del menu code - override methods
    public ToDoExceptions(String message, HttpStatus httpStatus) {
        super(message);
        // Asignamos a estas propiedades los argumentos recibidos
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
