package terminal;

import zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }



        public CommandExecutable create (Command input){
            EnumCommand code = input.getCommandEnum();
            CommandExecutable exec = code.getMethod();
            return exec.getZoo(zoo, input);
        }

    }

