package animalUtils;

import animals.Animal;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalUtils {
    public static <T extends Animal> void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList,new AgeComparator());
    }
}
