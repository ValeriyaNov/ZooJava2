package terminal.animalExecutable;

import terminal.command.Command;
import terminal.command.CommandExecutable;
import zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {
    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo){
        this.zoo = zoo;
    }
    public DeleteWolfExecutable() {
    }
    public  DeleteWolfExecutable getZoo(Zoo zoo, Command command) {
        return new DeleteWolfExecutable(zoo);
    }

    @Override
    public  void execute(){
        this.zoo.takeOfWolf();
    }
}
