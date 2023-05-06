package com.tarcalia.service;

import com.tarcalia.model.Animal;

/**
 * Service interface for {@link Animal} entities.
 */
public interface AnimalService {

    /**
     * Generate a random {@link Animal} entity.
     * @return the generated entity in DTO form.
     */
    Animal getRandomAnimal();
}
