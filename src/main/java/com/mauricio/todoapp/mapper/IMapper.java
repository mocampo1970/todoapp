package com.mauricio.todoapp.mapper;

public interface IMapper <I, O>{

    // De esta manera nos permite mapear lo que entremos por I a O
    public O map(I in);

}
