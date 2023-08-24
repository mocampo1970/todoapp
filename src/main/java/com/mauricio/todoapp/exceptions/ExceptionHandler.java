package com.mauricio.todoapp.exceptions;

import com.mauricio.todoapp.TodoappApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ToDoExceptions.class})
    protected ResponseEntity<Object> handleConflict(
     ToDoExceptions ex, WebRequest request){
        String bodyOfResponse = ex.getMessage();
        //return null;
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), ex.getHttpStatus(), request);
    }

    private ResponseEntity<Object> handleExceptionInternal(ToDoExceptions ex, String bodyOfResponse, HttpHeaders httpHeaders, HttpStatus httpStatus, WebRequest request) {
        return null;
    }
}
