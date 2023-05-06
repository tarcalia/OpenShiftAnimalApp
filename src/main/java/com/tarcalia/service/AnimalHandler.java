package com.tarcalia.service;

import com.github.javafaker.Faker;
import com.tarcalia.model.Animal;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Service class for {@link Animal} entities.
 */
@Service
public class AnimalHandler implements AnimalService {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    @Override
    public Animal getRandomAnimal() {
        return new Animal(
                FAKER.dog().name(),
                FAKER.lordOfTheRings().location(),
                RANDOM.nextInt(14)
        );
    }
}
