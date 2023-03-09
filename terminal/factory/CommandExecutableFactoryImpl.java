package terminal.factory;

import terminal.command.Command;
import terminal.command.CommandExecutable;
import terminal.command.EnumCommand;
import terminal.animalExecutable.CreateLionExecutable;
import zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;
    private CreateLionExecutable cc;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }



        public CommandExecutable create (Command input){
            EnumCommand code = input.getCommandEnum();
            CommandExecutable exec = code.getMethod();
            return exec.getZoo(zoo, input);
        }

    }

