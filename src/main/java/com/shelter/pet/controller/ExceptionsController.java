package com.shelter.pet.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.shelter.pet.handler.PetNotFoundException;

@ControllerAdvice
public class ExceptionsController {
    @ExceptionHandler(PetNotFoundException.class)
    public String petNotFoundException(PetNotFoundException p){
        return "404";
    }
}
