package terminal;

public enum EnumCommand {
    //WOLF_DELETE("wolfdelete", 2, new DeleteWolfExecutable()),
    //WOLF_CREATE("wolfcreate", 6, new CreateWolfExecutable()),
    LION_DELETE("liondelete", 2, new DeleteLionExecutable()),
    LION_CREATE("lioncreate", 6 , new CreateLionExecutable()),
    ;

    private final String title;

    private final int args;

    private CommandExecutable method;

    EnumCommand(String wolfdelete, int i, CommandExecutable method) {
        this.title = wolfdelete;
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

    //public boolean checkType(String animal, String action){
        //return title.equals(animal + action);
    //}
}
