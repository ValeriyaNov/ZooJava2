package Animals;

public abstract class Animal {
    protected int yearBirth;
    protected int weight;
    protected int countLimbs;

    public Animal(int yearBirth, int weight, int countLimbs){
        this.yearBirth = yearBirth;
        this.weight = weight;
        this.countLimbs = countLimbs;
    }

    public abstract int getMaxWeight();
    public abstract String getTypeAnimal();

    abstract void feed(int foodWeight);

    public int getYear() {
        return yearBirth;
    }

    public void setYear(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getWeight() {
        return weight;
    }

    public int getCountLimbs() {
        return countLimbs;
    }

    public void setCountLimbs(int countLimbs) {
        this.countLimbs = countLimbs;
    }


}
