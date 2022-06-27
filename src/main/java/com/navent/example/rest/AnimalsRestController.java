package com.navent.example.rest;

import com.navent.example.model.Animal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/animals")
@Validated
public class AnimalsRestController {


    @GetMapping("{animal}")
    public Animal getAnimalPath(@PathVariable(value = "animal") String name) {

        Animal animal = new Animal();
        animal.setName(name);

        return animal;
    }

    @GetMapping("filters")
    public Animal getAnimal(@RequestParam(value = "name", required = true) @Valid @Size(min=4)  String name,
                            @RequestParam(value = "color") @Valid @NotBlank String color) {
        Animal animal = new Animal();
        animal.setName(name);
        animal.setColor(color);
        return animal;
    }

    @PostMapping("create")
    public Animal createUser(@Valid @RequestBody AnimalDTO animalDTO) {
        Animal animal = new Animal();
        animal.setName(animalDTO.getNombre());
        animal.setColor(animalDTO.getColor());
        return animal;
    }


}
