package org.khloptsev.animals;

public abstract class Animal {
    private final int WEIGHT;
    private final int POPULATION;
    private final int MAX_SPEED;
    private final int FOOD_REQUIRED;

    public Animal(int weight, int population, int maxSpeed, int foodRequired) {
        WEIGHT = weight;
        POPULATION = population;
        MAX_SPEED = maxSpeed;
        FOOD_REQUIRED = foodRequired;
    }

    public int getWeight() {
        return WEIGHT;
    }

    public int getPopulation() {
        return POPULATION;
    }

    public int getSpeed() {
        return MAX_SPEED;
    }

    public int getFoodRequired() {
        return FOOD_REQUIRED;
    }




    public abstract void move();
    public abstract void eat();
    public abstract void reproduce();
}
