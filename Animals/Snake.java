package Animals;

public class Snake extends Animal {

    protected static final int MAX_WEIGHT = 20;
    protected static final String type = "snake";

    protected int bodyLength;

    public Snake(int yearBirth, int weight, int countLimbs, int bodyLength) {
        super(yearBirth, weight, countLimbs);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    @Override
    public String getTypeAnimal() {
        return type;
    }

    @Override
    public void feed(int foodWeight) {

    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    //}
    @Override
    public String toString() {
        return "Snake {" +
                "BodyLength = " + bodyLength +
                ", yearBirth = " + yearBirth +
                ", weight = " + weight +
                ", countLimbs = " + countLimbs +
                "}\n";
    }
}
