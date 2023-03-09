package terminal.factory;

import terminal.command.Command;
import terminal.command.CommandExecutable;
import zoo.Zoo;

public class LogingCommandExecutableFactor extends CommandExecutableFactoryImpl {
    public LogingCommandExecutableFactor(Zoo zoo) {
        super(zoo);
    }


    @Override
    public CommandExecutable create(Command command) {
        System.out.println("Зоопарк до");
        CommandExecutable com = super.create(command);
        System.out.println("Зоопарк после");
        return com;
    }
}
