package terminal.command;

import terminal.command.Command;

public interface CommandParser {
    default Command parseCommand(String inputLst) {

            String[] input = inputLst.split("\\s+");
            String operation = input[0];
            String typeAnimal = input[1];
            int yearInput = 0;
            int weightInput = 0;
            String anonimParametr = "null";
            if (operation.equals("добавить")) {
                yearInput = Integer.parseInt(input[2]);
                weightInput = Integer.parseInt(input[3]);
                anonimParametr = input[4];
            }
            return new Command(operation, typeAnimal, yearInput, weightInput, anonimParametr);

        }
    }