package Cage;

import Animals.*;

import java.util.*;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {
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
    public void addAnimal(Wolf animal) {
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
                wolf.feed(foodWeight/ wolfs.size());

            }
    }
    public void sortWright(){
        Comparator newc = new WolfComparator();
        wolfs.sort(newc);

    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolfs);
    }

    public void wolfAgeSort(){
        Collections.sort(wolfs, new WolfYearComparator());
    }

}