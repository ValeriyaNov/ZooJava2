package terminal.menu;

public class Menu extends Messages {
    public Menu(){
        this.message = "Добрый день!\nдобавить - добавить животное (лев или волк); \n" +
                "вывести - вывести из клетки животное (лев или волк)\n ";
        System.out.println(message);
    }

}
