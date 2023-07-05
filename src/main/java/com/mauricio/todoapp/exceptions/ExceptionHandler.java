package com.mauricio.todoapp.exceptions;

import com.mauricio.todoapp.TodoappApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHandler {

    //@org.springframework.web.bind.annotation.ExceptionHandler(value = {TodoappApplication.class});
    /*protected ResponseEntity<Object> handleConflict(
     TodoAppException ex, WebRequest request){

    }*/
}
