package org.khloptsev.island;

import org.khloptsev.animals.Animal;
import org.khloptsev.animals.factory.AnimalFactory;
import org.khloptsev.animals.types.AnimalType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Cell {
    private int plants;
    private final Position position;
    private final ArrayList<Animal> animals = new ArrayList<>();

    private Map<AnimalType, Integer> cellPopulation = new HashMap<>();

    Random rand = new Random();

    public Cell(Position position) {
        this.position = position;
        init();
    }

    public Position getPosition() {
        return position;
    }

    private void init() {
        for (AnimalType type : AnimalType.values()) {
            int animalPopulation = rand.nextInt(1, AnimalFactory.getPopulation(type) + 1);
            for (int i = 0; i < animalPopulation; i++) {
                Animal animal = AnimalFactory.create(type);
                animal.setPosition(position);
                animals.add(animal);

                if (cellPopulation.containsKey(type)) {
                    cellPopulation.replace(type, cellPopulation.get(type) + 1);
                } else {
                    cellPopulation.put(type, 1);
                }
            }
        }
        plants = rand.nextInt(1, 201);
    }

    public String getPopulationInfo() {
        return "Population: " + cellPopulation;
    }

    public String getPlantsInfo() {
        return "Plants: " + plants;
    }

    @Override
    public String toString() {
        return "{" +
                "y=" + position.getY() +
                ", x=" + position.getX() +
                '}';
    }


}
