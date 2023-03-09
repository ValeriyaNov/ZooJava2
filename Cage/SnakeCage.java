package Cage;

import animals.*;

import java.util.*;

public class SnakeCage implements AnimalCage<Snake> {

    protected int cleanCage;
    protected ArrayList<Snake> snake;

    public SnakeCage(ArrayList<Snake> snake) {
        this.snake = snake;
    }


    public ArrayList<Snake> getSnake() {
        return snake;
    }

    public void setWolfs(ArrayList<Wolf> wolfs) {
        this.snake = snake;
    }

    @Override
    public void addAnimal(Snake animal) {

        snake.add(animal);
    }


    @Override
    public int cleanCase() {
        return 0;
    }

    //@Override
    public Snake getRandomAnimal() {
        Random rnd = new Random();

        int randomIndex = rnd.nextInt(snake.size());

        for (int i = 0; i < snake.size(); i++) {
            if (i == randomIndex) {
                return snake.get(i);
            }
        }
        Snake nullSnake = new Snake(0, 0, 0, 0);
        return nullSnake;
    }

    @Override
    public void giveFood(int foodWeight) {
        for (Snake snake1 : snake) {
            snake1.feed(foodWeight/snake.size());

        }

    }
}