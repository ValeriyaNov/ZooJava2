package Cage;

import Animals.Animal;
import animalUtils.AgeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface AnimalCage<T extends Animal> {


    void addAnimal(T animal);

    default void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList,new AgeComparator());
    }


    int cleanCase();

    void giveFood(int foodWeight);

    T getRandomAnimal();

}
