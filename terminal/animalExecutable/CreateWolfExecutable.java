package terminal.animalExecutable;

import animals.Wolf;
import terminal.command.Command;
import terminal.command.CommandExecutable;
import zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {
    private Zoo zoo;
    private Wolf wolf;

    public CreateWolfExecutable(Zoo zoo, Command command) {
        this.zoo = zoo;
        this.wolf = new Wolf(command.getYearInput(), command.getWeightInput(), 4, command.getAnonimParametr());
    }
    public CreateWolfExecutable getZoo(Zoo zoo, Command command) {
        return new CreateWolfExecutable(zoo, command);
    }
    public CreateWolfExecutable() {

    }

    @Override
    public void execute() {
        this.zoo.addWolf(wolf);
    }
}
