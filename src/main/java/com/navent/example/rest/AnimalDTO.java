package com.navent.example.rest;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class AnimalDTO {

    @NotNull
    private String nombre;

    @Size(max = 10)
    private String color;

    @Email
    private String email;

}
