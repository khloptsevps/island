package org.khloptsev.animals.types.predators;

public class Wolf extends Predator {
    public Wolf() {
        super(30, 30, 3, 8);
    }

    @Override
    public void move() {
        System.out.println("Wolf move");
    }

    @Override
    public void eat() {
        System.out.println("Wolf eat");
    }

    @Override
    public void reproduce() {
        System.out.println("Wolf reproduce");
    }
}
