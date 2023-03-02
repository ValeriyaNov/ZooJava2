package Factory;


import Animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionFactory {
    public static void main(String[] args) {
        ArrayList<Lion> lionInCage = new ArrayList<Lion>();

    }

    static public ArrayList<Lion> createLion(int lioncount) {
        ArrayList<Lion> lionInCage = new ArrayList<Lion>(lioncount);
        Random rnd = new Random();
        for (int i = 0; i < lioncount; i++) {

            Lion lion = new Lion(2018 + rnd.nextInt(4), 45 + rnd.nextInt(10), 4, rnd.nextInt(4));
            lionInCage.add(lion);
        }
        return lionInCage;
    }

    public static void PrintWolfCage(ArrayList<Lion> wolfInCage) {
        for (Lion wolf : wolfInCage)
            System.out.println(wolf.toString()+"\n");

    }

}

