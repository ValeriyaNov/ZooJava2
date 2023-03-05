package terminal;

import zoo.Zoo;
import java.util.Scanner;
//import parser.CommandParser;

import static terminal.ChekInputData.isChek;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser; //public
    private CommandExecutable commandExecutable;
    private Zoo zoo;

    public void setZoo (Zoo zoo){
        this.zoo = zoo;
    }

    public TerminalReader(CommandParser commandParser) {

        this.commandParser = commandParser;
    }
    public static TerminalReader newTerminalReader(CommandParser commandParser) {//private
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }
    private void setCommandExecutable(Command command) {
        this.commandExecutable = new CommandExecutableFactoryImpl(zoo).create(command);
    }

    public void endless() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            new Menu();
            //System.out.println("Добрый день. Введите, пожалуйста, через пробел действие с животным('добавить' или 'вывести') и тип животного ('лев' или 'волк')");
            String input = scanner.nextLine();

            if (input.equals("stop")) break;
            if (input.contains("добавить")){
                new AddMenu();
                //System.out.println("Введите параметры животного: год рождения, вес, объем гривы(для льва) или окрас(для волка)");
                String inputAdd = scanner.nextLine();
                System.out.println(inputAdd);//удалить потом

                input = input +" "+inputAdd;
                System.out.println(input);//удалить потом
            }

            if (true){
                Command comm = this.commandParser.parseCommand(input);
                this.setCommandExecutable(comm);
                this.commandExecutable.execute();


            }
            else{
                System.out.println("Ошибка");
                break;
            }
        }
        scanner.close();
    }

}