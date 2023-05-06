package com.tarcalia.controller;

import com.tarcalia.model.Animal;
import com.tarcalia.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for {@link Animal} entities.
 */
@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService service;

    @GetMapping("/random")
    public Animal getRandomAnimal() {
        return service.getRandomAnimal();
    }
}
