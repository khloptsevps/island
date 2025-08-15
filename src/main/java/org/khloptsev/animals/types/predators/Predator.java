package org.khloptsev.animals.types.predators;

import org.khloptsev.animals.Animal;

public abstract class Predator extends Animal {
    public Predator(int weight, int populationPerCell, int maxSpeed, int foodRequired) {
        super(weight, populationPerCell, maxSpeed, foodRequired);
    }
}
