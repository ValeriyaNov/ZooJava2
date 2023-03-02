import Animals.Wolf;
import Animals.Lion;
import Cage.LionCage;
import Cage.WolfCage;
import Factory.LionFactory;
import Factory.WolfFactory;
import terminal.TerminalReader;
import zoo.Zoo;

import java.util.ArrayList;
//Необходимо все данные вводить в консоль через запятую без пробела

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = WolfFactory.createWolf(4);

        WolfCage wolfInCage = new WolfCage(wolfs);

        ArrayList<Lion> lions = LionFactory.createLion(4);

        LionCage lionInCage = new LionCage(lions);
        //System.out.println("Before sort");

        //WolfFactory.PrintWolfCage(wolfs);
        //System.out.println("After sort");

        //System.out.print("Random wolf: ");
        //System.out.println((wolfInCage.getRandomAnimal()).toString());
        //wolfInCage.giveFood(20);
        //wolfInCage.sortWright();
        //AnimalUtils.sortByAge(wolfs);
        //System.out.println(wolfs);
        //for (Wolf wolf : wolfInCage) {
        //System.out.printf("Окрас %s, Год рождения %d, Вес %d, Количество конечностей %d \n", wolf.getColor(), wolf.getYear(), wolf.getWeight(), wolf.getCountLimbs());

        //}
        //System.out.println("After sort year ");
        //wolfInCage.wolfAgeSort();
        //for (Wolf wolf : wolfInCage) {
        //System.out.printf("Окрас %s, Год рождения %d, Вес %d, Количество конечностей %d \n", wolf.getColor(), wolf.getYear(), wolf.getWeight(), wolf.getCountLimbs());


        Zoo zoo = new Zoo(wolfInCage, lionInCage, null);
        TerminalReader terminal = new TerminalReader();
        terminal.endless(zoo);
        System.out.println("________________________");
        //System.out.println(wolfInCage);
        //System.out.println(lionInCage);
        for (Wolf wolf : wolfInCage) {
            System.out.printf("Окрас %s, Год рождения %d, Вес %d, Количество конечностей %d \n", wolf.getColor(), wolf.getYear(), wolf.getWeight(), wolf.getCountLimbs());

            }
        }
    }
}

