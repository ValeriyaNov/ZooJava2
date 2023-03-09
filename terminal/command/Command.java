package terminal.command;

public class Command {
    public static final String WOLF_CREATE = "добавитьволк";
    public static final String LION_CREATE = "добавитьлев";
    public static final String WOLF_DELETE = "вывестиволк";
    public static final String LION_DELETE = "вывестилев";


    private String operations;
    private String typeAnimal;
    private int yearInput;
    private int weightInput;
    private String anonimParametr;

    public Command(String operations, String typeAnimal, int yearInput, int weightInput, String anonimParametr) {
        this.typeAnimal = typeAnimal;
        this.operations = operations;
        this.yearInput = yearInput;
        this.weightInput = weightInput;
        this.anonimParametr = anonimParametr;

    }

    public String getOperations() {
        return operations;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public int getYearInput() {
        return yearInput;
    }

    public int getWeightInput() {
        return weightInput;
    }

    public String getAnonimParametr() {
        return anonimParametr;
    }


    public EnumCommand getCommandEnum() {
        for (EnumCommand x : EnumCommand.values()) {
            if (x.checkType(this.typeAnimal, this.operations)) {
                System.out.println(x);
                return (EnumCommand) x;
            }

        }
        return null;
    }
}


