package terminal;

import static java.lang.Character.isDigit;


public class ChekInputData {

    public static boolean isChek (String inputLst){
        String[] input = inputLst.split(" ");
        String param = input[1];

        if (input.length == 5 && input[0].equals("добавить")) {
            String param2 = input[4];
            String param3 = input[2];
            String param4 = input[3];
            switch (param) {
                case "лев" -> {
                    if (Character.isDigit(Integer.parseInt(param2)) &&
                            Character.isDigit(Integer.parseInt(param3)) &&
                                    Character.isDigit(Integer.parseInt(param4))) {
                        return true;
                    } else return false;
                }
                case "волк" -> {
                    if ((!(Character.isDigit(Integer.parseInt(param2))) || param2.length() == 3) &&
                                Character.isDigit(Integer.parseInt(param3)) &&
                                    Character.isDigit(Integer.parseInt(param4))) {
                        return true;}
                    else return false;
                }
                default -> {
                    return false;
                }
                //if (isDigital(param3)) return true;
            }
        }
        else if (input.length == 2 && input[0].equals("вывести")){
            switch (param){   //хотела через if но стал ругаться (коллапс)? Зато я могу если что добавить "змею" ном будет
                case "лев","волк" ->{
                    return true;
                }
                default -> {return false;}
            }
            }
            else return true;

        }
    }
