package org.khloptsev.animals;

import org.khloptsev.island.Position;

public abstract class Animal {
    private final int WEIGHT;
    private final int POPULATION_PER_CELL;
    private final int MAX_SPEED;
    private final int FOOD_REQUIRED;
    private Position position;

    public Animal(int weight, int populationPerCell, int maxSpeed, int foodRequired) {
        WEIGHT = weight;
        POPULATION_PER_CELL = populationPerCell;
        MAX_SPEED = maxSpeed;
        FOOD_REQUIRED = foodRequired;
    }

    public int getWeight() {
        return WEIGHT;
    }

    public int getPopulation() {
        return POPULATION_PER_CELL;
    }

    public int getSpeed() {
        return MAX_SPEED;
    }

    public int getFoodRequired() {
        return FOOD_REQUIRED;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public abstract void move();
    public abstract void eat();
    public abstract void reproduce();
}
