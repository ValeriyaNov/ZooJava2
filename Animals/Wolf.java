package Animals;

import java.util.Comparator;

public class Wolf extends Animal implements Comparator<Wolf> {
    protected String color;

    protected static final int MAX_WEIGHT = 55;
    protected static final String TYPE_ANIMAL = "Wolf";

    public Wolf(int yearBirth, int weight, int countLimbs, String color) {
        super(yearBirth, weight, countLimbs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getTypeAnimal() {
        return TYPE_ANIMAL;
    }

    @Override
    public String toString() {
        return "Wolf {" +
                "color = " + color +
                ", yearBirth = " + yearBirth +
                ", weight = " + weight +
                ", countLimbs = " + countLimbs +
                "}\n";
    }

    @Override
    public void feed(int porsionFood) {
        if (this.weight + porsionFood <= MAX_WEIGHT) {
            this.weight = this.weight + porsionFood;
            System.out.println("The wolf is fed");
        } else {
            System.out.println("Max weight is exceeded");
        }
    }


    public int compareTo(Wolf wolf1, Wolf wolf2) {
        //return (wolf1.getYear() - wolf2.getYear());
        if (wolf1.getYear() > wolf2.getYear()) {
            return 1;
        } else if (wolf1.getYear() < wolf2.getYear()) {
            return -1;
        } else return 0;

    }
    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {
        if (wolf1.getWeight() == wolf2.getWeight()) {

            return compareTo(wolf1, wolf2);


        } else {
            if (wolf1.getWeight() > wolf2.getWeight()) {

                return 1;
            } else if (wolf1.getWeight() < wolf2.getWeight()) {
                return -1;
            } else return 0;
        }


    }
}
