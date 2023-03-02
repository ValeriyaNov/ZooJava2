package terminal;

import Animals.Lion;
import Animals.Wolf;
import zoo.Zoo;


public class CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    CommandExecutable create(String[] input) {
        String operation = input[0];
        String typeAnimal = input[1];
        if (operation.equals("вывести")) {
            switch (typeAnimal) {
                case "лев" -> {
                    return new DeleteLionExecutable(zoo);
                }
                case "волк" -> {
                    return new DeleteWolfExecutable(zoo);
                }
            }
        } else if (operation.equals("добавить")) {
            int yearInput = Integer.parseInt(input[2]);
            int weightInput = Integer.parseInt(input[3]);
            String anonimParametr = input[4];
            if (input.length!=5){
                System.out.println("Некорректные данные");
            }
            switch (typeAnimal) {
                case "лев" -> {
                    Lion lion = new Lion(yearInput, weightInput, 4, Integer.parseInt(anonimParametr));
                    return new CreateLionExecutable(zoo, lion);
                }
                case "волк" -> {
                    Wolf wolf = new Wolf(yearInput, weightInput, 4, anonimParametr);
                    return new CreateWolfExecutable(zoo, wolf);
                }
            }
        }
        return null;
    }
}