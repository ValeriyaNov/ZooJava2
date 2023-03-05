package terminal;

import zoo.Zoo;

public class LogingCommandExecutableFactor extends CommandExecutableFactoryImpl{
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
