package Animals;

public class Wolf extends Animal {
    protected String color;

    protected static final int MAX_WEIGHT = 55;
    protected static final String TYPE_ANIMAL = "Wolf";

    public Wolf(int yearBirth, int weight, int countLimbs, String color){
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
    public String getTypeAnimal(){
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
    public void feed(int porsionFood){
        if (this.weight + porsionFood <= MAX_WEIGHT){
            this.weight = this.weight + porsionFood;
            System.out.println("The wolf is fed");
        }
        else{
            System.out.println("Max weight is exceeded");
        }
    }
}
