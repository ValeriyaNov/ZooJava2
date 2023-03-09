package terminal.command;

import terminal.animalExecutable.CreateLionExecutable;
import terminal.animalExecutable.CreateWolfExecutable;
import terminal.animalExecutable.DeleteLionExecutable;
import terminal.animalExecutable.DeleteWolfExecutable;
import terminal.command.CommandExecutable;

public enum EnumCommand {
    WOLF_DELETE("вывестиволк",  new DeleteWolfExecutable()),
    WOLF_CREATE("добавитьволк",  new CreateWolfExecutable()),
    LION_DELETE("вывестилев",  new DeleteLionExecutable()),
    LION_CREATE("добавитьлев",  new CreateLionExecutable()),
    ;

    private final String title;

    private CommandExecutable method;

    EnumCommand(String title, CommandExecutable method) {
        this.title = title;
        this.method = method;
    }


    public String getTitle() {
        return title;
    }


    public CommandExecutable getMethod() {
        return method;
    }

    public boolean checkType(String typeAnimal, String operations) {
        if (title.equals(operations+typeAnimal)) {
            return true;
        }
        else return false;
    }

}
