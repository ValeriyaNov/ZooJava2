package terminal;

public class ChekDigit {
    public static boolean isDigital(String numberStr){
        try {
            Long.parseLong(numberStr);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
