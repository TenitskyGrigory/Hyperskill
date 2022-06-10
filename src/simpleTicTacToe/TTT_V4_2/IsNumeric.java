package src.simpleTicTacToe.TTT_V4_2;

public class IsNumeric {
    public static boolean isNumeric(String string1, String string2) {
        int intValue1;
        int intValue2;

        try {
            intValue1 = Integer.parseInt(string1);
            intValue2 = Integer.parseInt(string2);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers! 123");
        }
        return false;
    }
}
