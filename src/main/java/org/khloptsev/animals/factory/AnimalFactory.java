package org.khloptsev.animals.factory;

import org.khloptsev.animals.Animal;
import org.khloptsev.animals.types.AnimalType;
import org.khloptsev.animals.types.Wolf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class AnimalFactory {
    public static Map<AnimalType, Supplier<Animal>> registry = new ConcurrentHashMap<>();

    static {
        registry.put(AnimalType.WOLF, Wolf::new);
    }

    public static Animal create(AnimalType type) {
        Supplier<Animal> supplier = registry.get(type);
        if (supplier == null) {
            throw new IllegalArgumentException("Неизвестный тип животного: " + type);
        }
        return supplier.get();
    }

    public static int getPopulation(AnimalType type) {
        Supplier<Animal> supplier = registry.get(type);
        if (supplier == null) {
            throw new IllegalArgumentException("Неизвестный тип животного: " + type);
        }
        return supplier.get().getPopulation();
    }

    public static void p() {
        System.out.println(registry);
    }
}
