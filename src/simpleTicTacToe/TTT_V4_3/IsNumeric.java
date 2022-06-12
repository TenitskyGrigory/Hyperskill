package src.simpleTicTacToe.TTT_V4_3;

public class IsNumeric {
    public static boolean isNumeric(String string1, String string2) {
        int intValue1;
        int intValue2;

        try {
            intValue1 = Integer.parseInt(string1);
            intValue2 = Integer.parseInt(string2);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers! 2");
        }
        return false;
    }

    public static boolean isNumeric(String string1) {
        int intValue1;
//        int intValue2;

        try {
//            intValue1 = Integer.parseInt(string1);
//            intValue2 = Integer.parseInt(string2);
            intValue1 = Integer.parseInt(string1);
//            intValue2 = Integer.parseInt(string2);
//            if (intValue1 < 0 || intValue1 > 3) {
//                System.out.println("Coordinates should be from 1 to 3!");
//            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers! 1");
        }
        return false;
    }
}
