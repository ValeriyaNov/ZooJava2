import Animals.Animal;
import Animals.Wolf;
import Cage.WolfCage;
import Factory.WolfFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = WolfFactory.createWolf(4);

        WolfCage wolfInCage = new WolfCage(wolfs);

        WolfFactory.PrintWolfCage(wolfs);

        System.out.print("Random wolf: ");

        System.out.println((wolfInCage.getRandomAnimal()).toString());

        wolfInCage.giveFood(2);
        WolfFactory.PrintWolfCage(wolfs);

    }
}
