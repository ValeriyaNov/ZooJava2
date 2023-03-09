package terminal.check;

import static java.lang.Character.isDigit;
import static terminal.check.ChekDigit.isDigital;


public class ChekInputData {

    public static boolean isChek (String inputLst){
        String[] input = inputLst.split("\\s+");
        String param = input[1];

        if (input.length == 5 && input[0].equals("добавить")) {
            String param2 = input[4];
            String param3 = input[2];
            String param4 = input[3];


            switch (param) {
                case "лев" -> {
                    if (isDigital(param3) &&
                            isDigital(param3) &&
                                    isDigital(param4)){
                        return true;
                    }
                    else return false;
                }
                case "волк" -> {
                    if (((!isDigital(param2)) && param2.length() >= 3) &&
                            isDigital(param3) &&
                    isDigital(param4)) {
                        return true;}
                    else return false;
                }
                default -> {
                    return false;
                }

            }
        }
        else if (input.length == 2 && input[0].equals("вывести")){
            switch (param){
                case "лев","волк" ->{
                    return true;
                }
                default -> {return false;}
            }
            }
            else return false;

        }
    }
