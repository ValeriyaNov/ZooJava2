import Animals.Animal;
import Animals.Wolf;
import Cage.WolfCage;
import Factory.WolfFactory;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = WolfFactory.createWolf(4);

        WolfCage wolfInCage = new WolfCage(wolfs);
        System.out.println("Before sort");

        WolfFactory.PrintWolfCage(wolfs);
        System.out.println("After sort");

        //System.out.print("Random wolf: ");
        //System.out.println((wolfInCage.getRandomAnimal()).toString());
        //wolfInCage.giveFood(2);
        wolfInCage.sortWright();

        for (Wolf wolf : wolfInCage) {
            System.out.printf("Окрас %s, Год рождения %d, Вес %d, Количество конечностей %d \n", wolf.getColor(), wolf.getYear(), wolf.getWeight(), wolf.getCountLimbs());

        }
        System.out.println("After sort year ");
        wolfInCage.wolfAgeSort();
        for (Wolf wolf : wolfInCage) {
            System.out.printf("Окрас %s, Год рождения %d, Вес %d, Количество конечностей %d \n", wolf.getColor(), wolf.getYear(), wolf.getWeight(), wolf.getCountLimbs());


        }
    }
}
