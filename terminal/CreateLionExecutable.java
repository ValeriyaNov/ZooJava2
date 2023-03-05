package terminal;

import Animals.Lion;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable{
    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Command command) {
        this.zoo = zoo;
        this.lion = new Lion(command.getYearInput(), command.getWeightInput(), 4, Integer.parseInt(command.getAnonimParametr()));
    }

    public CreateLionExecutable getZoo(Zoo zoo, Command command) {
        return new CreateLionExecutable(zoo, command);
    }
    public CreateLionExecutable() {

    }


    @Override
    public void execute() {
        this.zoo.addLion(lion);
    }
}
