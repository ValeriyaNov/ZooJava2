package animalUtils;

import animals.Animal;

import java.util.Comparator;

public class AgeComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getYear() < o2.getYear()){
            return 1;
        }
        else if(o1.getYear() > o2.getYear()){
            return -1;
        }
        return 0;
    }

}
