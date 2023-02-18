package Cage;

import Animals.Animal;

import java.util.ArrayList;

public interface AnimalCage {

    void addAnimal(Animal animal);

    int cleanCase();

    void giveFood(int foodWeight);

    Animal getRandomAnimal();

}
