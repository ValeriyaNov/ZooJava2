package terminal;

import zoo.Zoo;
import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser; //public

    public TerminalReader() {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader() {//private
        if (terminalReader == null) {
            terminalReader = new TerminalReader();
        }
        return terminalReader;
    }

    public void endless(Zoo zoo) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Добрый день. Введите, пожалуйста, через пробел действие с животным('добавить' или 'вывести') и тип животного ('лев' или 'волк')");
            String input = scanner.nextLine();

            if (input.equals("stop")) break;
            if (input.contains("добавить")){

                System.out.println("Введите параметры животного: год рождения, вес, объем гривы(для льва) или окрас(для волка)");
                String inputAdd = scanner.nextLine();
                System.out.println(inputAdd);

                input = input +","+inputAdd;
                System.out.println(input);
            }
            String[] imputlst = CommandParser.parseCommand(input);

            if (ChekInput(imputlst)){
                CommandExecutableFactory procedure = new CommandExecutableFactory(zoo);
                procedure.create(imputlst).execute();
            }
            else{
                break;
            }

        }
        scanner.close();
    }

    boolean ChekInput(String[] lst) {
        String typeAnimal = lst[1];
        if (lst[0].equals("добавить") && typeAnimal.equals("лев") || lst[0].equals("добавить") && typeAnimal.equals("волк")) {
            return true;
        } else if (lst[0].equals("вывести") && typeAnimal.equals("лев") || lst[0].equals("вывести") && typeAnimal.equals("волк")) {
            return true;
        } else {
            System.out.println("Некорректные данные");
            return false;
        }
    }
}