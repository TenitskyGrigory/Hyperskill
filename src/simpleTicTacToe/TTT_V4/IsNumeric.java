package src.simpleTicTacToe.TTT_V4;

public class IsNumeric {
    public static boolean isNumeric(String string) {
        int intValue1;
        int intValue2;

        try {
            intValue1 = Integer.parseInt(string);
            intValue2 = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers!");
        }
        return false;
    }
}
