package Factory;

import Animals.Wolf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WolfFactory {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfInCage = new ArrayList<Wolf>();

    }

    static public ArrayList<Wolf> createWolf(int wolfcount) {
        ArrayList<Wolf> wolfInCage = new ArrayList<Wolf>(wolfcount);
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("gray", "white", "black"));
        Random rnd = new Random();
        for (int i = 0; i < wolfcount; i++) {
            String color1 = colors.get(rnd.nextInt(3));
            Wolf wolf = new Wolf(2018 + rnd.nextInt(4), 45 + rnd.nextInt(10), 4, color1);
            wolfInCage.add(wolf);
        }
        return wolfInCage;
    }

    public static void PrintWolfCage(ArrayList<Wolf> wolfInCage) {
        for (Wolf wolf : wolfInCage)
            System.out.println(wolf.toString()+"\n");

    }

}

