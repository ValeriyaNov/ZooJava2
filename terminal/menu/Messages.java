package terminal.menu;

public abstract class Messages {
    protected String message;

    public void printMessage(){
        System.out.println(this.message);
    }
}
