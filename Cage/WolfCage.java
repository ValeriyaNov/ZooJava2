package Cage;

import Animals.Animal;
import Animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolfCage implements AnimalCage {
    protected int cleanCage;
    protected ArrayList<Wolf> wolfs;

    public WolfCage(ArrayList<Wolf> wolfs){
        this.wolfs = wolfs;
    }


    public ArrayList<Wolf> getWolfs() {
        return wolfs;
    }

    public void setWolfs(ArrayList<Wolf> wolfs){
        this.wolfs = wolfs;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Wolf) {
            wolfs.add((Wolf) animal);
        }
    }

    @Override
    public int cleanCase() {
        return 0;
    }

    //@Override
    public Wolf getRandomAnimal() {
        Random rnd = new Random();

        int randomIndex = rnd.nextInt(wolfs.size());

        for (int i = 0; i < wolfs.size(); i++) {
            if (i == randomIndex) {
                return (Wolf) wolfs.get(i);
            }
        }
        Wolf nullWolf = new Wolf(0, 0, 0, "null");
        return nullWolf;
    }

    @Override
    public void giveFood(int foodWeight) {
            for (Wolf wolf : wolfs) {
                wolf.feed(foodWeight);

            }
    }

}