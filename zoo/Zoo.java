package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import Cage.AnimalCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeTerrarium;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeTerrarium) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeTerrarium = snakeTerrarium;
    }


    public Wolf takeOfWolf() {
        return this.wolfCage.getRandomAnimal();
    }

    public void addWolf(Wolf animal) {
        this.wolfCage.addAnimal(animal);
    }

    public Lion takeOfLion() {

        return this.lionCage.getRandomAnimal();
    }

    public void addLion(Lion animal) {
        this.lionCage.addAnimal(animal);
    }


    @Override
    public String toString() {
        return "Zoo: \n" +
                "wolfs: \n" + wolfCage.toString() + "\n" +
                "lions: \n" + lionCage.toString() ;
    }
}