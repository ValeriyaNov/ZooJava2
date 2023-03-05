package terminal;

public enum EnumCommand {
    WOLF_DELETE("вывестиволк", 2, new DeleteWolfExecutable()),
    WOLF_CREATE("добавитьволк", 6, new CreateWolfExecutable()),
    LION_DELETE("вывестилев", 2, new DeleteLionExecutable()),
    LION_CREATE("добавитьлев", 6, new CreateLionExecutable()),
    ;

    private final String title;

    private final int args;

    private CommandExecutable method;

    EnumCommand(String title, int i, CommandExecutable method) {
        this.title = title;
        this.args = i;
        this.method = method;
    }


    public String getTitle() {
        return title;
    }

    public int getArgs() {
        return args;
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
