package terminal;

public class AddMenu extends Messages {
    public AddMenu(){
        this.message = "Отлично! Вы выбрали добавить животное!\nЗадайте параметры животного.\n" +
                "год, вес, окрас (если волк) и объем гривы (если лев); \n";
        System.out.println(message);
    }
}
