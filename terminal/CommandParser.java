package terminal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public interface CommandParser {
    default Command parseCommand(String inputLst) { //здесь я подаю строку или только с командой или с командой и параметрами

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