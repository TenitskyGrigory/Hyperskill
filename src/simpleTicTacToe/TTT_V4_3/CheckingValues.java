package src.simpleTicTacToe.TTT_V4_3;

public class CheckingValues {
    private String str;


    public void CheckingValues(String st, int a) {
        String[] str = new String[9];
        int i = 0;
        if (a == 11) {
            i = 0;
        }
        if (a == 12) {
            i = 1;
        }
        if (a == 13) {
            i = 2;
        }
        if (a == 21) {
            i = 3;
        }
        if (a == 22) {
            i = 4;
        }
        if (a == 23) {
            i = 5;
        }
        if (a == 31) {
            i = 6;
        }
        if (a == 32) {
            i = 7;
        }
        if (a == 33) {
            i = 8;
        }
        if (str[i].equals("X") || str[i].equals("O")) {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }
}
