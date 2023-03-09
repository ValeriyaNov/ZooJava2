package Cage;

import animals.Animal;
import animalUtils.AgeComparator;

import java.util.ArrayList;
import java.util.Collections;

public interface AnimalCage<T extends Animal> {


    void addAnimal(T animal);

    default void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList,new AgeComparator());
    }


    int cleanCase();

    void giveFood(int foodWeight);

    T getRandomAnimal();

}
