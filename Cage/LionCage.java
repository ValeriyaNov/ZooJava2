package Cage;

import animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionCage implements AnimalCage<Lion> {

    protected int cleanCage;
    protected ArrayList<Lion> lion;

    public LionCage(ArrayList<Lion> lion) {
        this.lion = lion;
    }


    public ArrayList<Lion> getLion() {
        return lion;
    }

    public void setLions(ArrayList<Lion> lion) {
        this.lion = lion;
    }

    @Override
    public void addAnimal(Lion animal) {

        lion.add(animal);
    }


    @Override
    public int cleanCase() {
        return 0;
    }

    //@Override
    public Lion getRandomAnimal() {
        Random rnd = new Random();

        int randomIndex = rnd.nextInt(lion.size());

        for (int i = 0; i < lion.size(); i++) {
            if (i == randomIndex) {
                System.out.println(lion.get(i));
                return lion.remove(i);
            }
        }
        Lion nullLion = new Lion(0,0,0,0);
        return nullLion;
    }

    @Override
    public void giveFood(int foodWeight) {
        for (Lion lion1 : lion) {
            lion1.feed(foodWeight/ lion.size());

        }
    }
    @Override
    public String toString() {
        String str = " ";
        for (Lion s: lion){
            str = str + s.toString() + " \n";

        }
        return str;
    }
}
