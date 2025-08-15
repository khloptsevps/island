package org.khloptsev.animals.types.herbivores;

import org.khloptsev.animals.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(int weight, int populationPerCell, int maxSpeed, int foodRequired) {
        super(weight, populationPerCell, maxSpeed, foodRequired);
    }
}
