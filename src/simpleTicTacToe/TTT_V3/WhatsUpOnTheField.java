package src.simpleTicTacToe.TTT_V3;

import java.util.Scanner;

/**
 * What's up on the field
 * Description
 * In this stage, we’re going to analyze the game state to determine if either of the players has
 * already won the game or it is still ongoing, if the game is a draw,
 * or if the user has entered an impossible game state (two winners, or with one player having made too many moves).
 *
 * Objectives
 * In this stage, your program should:
 *
 * Take a string entered by the user and print the game grid as in the previous stage.
 * Analyze the game state and print the result. Possible states:
 * Game not finished when neither side has three in a row but the grid still has empty cells.
 * Draw when no side has a three in a row and the grid has no empty cells.
 * X wins when the grid has three X’s in a row.
 * O wins when the grid has three O’s in a row.
 * Impossible when the grid has three X’s in a row as well as three O’s in a row,
 * or there are a lot more X's than O's or vice versa (the difference should be 1 or 0; if the difference is 2 or more,
 * then the game state is impossible).
 * In this stage, we will assume that either X or O can start the game.
 *
 * You can choose whether to use a space or underscore _ to print empty cells.
 *
 * Examples
 * The examples below show outputs and analysis results for different game states.
 * Your program should work in the same way.
 *
 * Notice that after Enter cells: comes the user input.
 */

public class WhatsUpOnTheField {
    public static void main(String[] args) {
        String[] str = new String[9];
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        for (int i = 0; i < str.length; i++) {
            str[i] = st.substring(i,i+1);
        }
        System.out.println("---------");
        System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
        System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
        System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
        System.out.println("---------");
        int countX = 0;
        int countO = 0;
        int count_ = 0;
        int countGame = 0;

        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("X")) {
                countX++;
            } else if(str[i].equals("O")) {
                countO++;
            } else {
                count_++;
            }
        }
        if((countX - countO > 1 || countO - countX > 1)
                || ((str[0].equals("X") && str[1].equals("X") && str[2].equals("X"))
                || (str[3].equals("X") && str[4].equals("X") && str[5].equals("X"))
                || (str[6].equals("X") && str[7].equals("X") && str[8].equals("X"))
                || (str[0].equals("X") && str[3].equals("X") && str[6].equals("X"))
                || (str[1].equals("X") && str[4].equals("X") && str[7].equals("X"))
                || (str[2].equals("X") && str[5].equals("X") && str[8].equals("X"))
                || (str[0].equals("X") && str[4].equals("X") && str[8].equals("X"))
                || (str[6].equals("X") && str[4].equals("X") && str[2].equals("X")))
                && ((str[0].equals("O") && str[1].equals("O") && str[2].equals("O"))
                || (str[3].equals("O") && str[4].equals("O") && str[5].equals("O"))
                || (str[6].equals("O") && str[7].equals("O") && str[8].equals("O"))
                || (str[0].equals("O") && str[3].equals("O") && str[6].equals("O"))
                || (str[1].equals("O") && str[4].equals("O") && str[7].equals("O"))
                || (str[2].equals("O") && str[5].equals("O") && str[8].equals("O"))
                || (str[0].equals("O") && str[4].equals("O") && str[8].equals("O"))
                || (str[6].equals("O") && str[4].equals("O") && str[2].equals("O")))) {
            System.out.println("Impossible");
            countGame++;
        }
        if (countGame > 0) {
            return;
        }
        if ((str[0].equals("X") && str[1].equals("X") && str[2].equals("X"))
                || (str[3].equals("X") && str[4].equals("X") && str[5].equals("X"))
                || (str[6].equals("X") && str[7].equals("X") && str[8].equals("X"))
                || (str[0].equals("X") && str[3].equals("X") && str[6].equals("X"))
                || (str[1].equals("X") && str[4].equals("X") && str[7].equals("X"))
                || (str[2].equals("X") && str[5].equals("X") && str[8].equals("X"))
                || (str[0].equals("X") && str[4].equals("X") && str[8].equals("X"))
                || (str[6].equals("X") && str[4].equals("X") && str[2].equals("X"))) {
            System.out.println("X wins");
            countGame++;
        }
        if (countGame > 0) {
            return;
        }
        if ((str[0].equals("O") && str[1].equals("O") && str[2].equals("O"))
                || (str[3].equals("O") && str[4].equals("O") && str[5].equals("O"))
                || (str[6].equals("O") && str[7].equals("O") && str[8].equals("O"))
                || (str[0].equals("O") && str[3].equals("O") && str[6].equals("O"))
                || (str[1].equals("O") && str[4].equals("O") && str[7].equals("O"))
                || (str[2].equals("O") && str[5].equals("O") && str[8].equals("O"))
                || (str[0].equals("O") && str[4].equals("O") && str[8].equals("O"))
                || (str[6].equals("O") && str[4].equals("O") && str[2].equals("O"))) {
            System.out.println("O wins");
            countGame++;
        }
        if (countGame > 0) {
            return;
        }
        if ((!(str[0].equals("X") && str[1].equals("X") && str[2].equals("X"))
                || !(str[3].equals("X") && str[4].equals("X") && str[5].equals("X"))
                || !(str[6].equals("X") && str[7].equals("X") && str[8].equals("X"))
                || !(str[0].equals("X") && str[3].equals("X") && str[6].equals("X"))
                || !(str[1].equals("X") && str[4].equals("X") && str[7].equals("X"))
                || !(str[2].equals("X") && str[5].equals("X") && str[8].equals("X"))
                || !(str[0].equals("X") && str[4].equals("X") && str[8].equals("X"))
                || !(str[6].equals("X") && str[4].equals("X") && str[2].equals("X")))
                && (!(str[0].equals("O") && str[1].equals("O") && str[2].equals("O"))
                || !(str[3].equals("O") && str[4].equals("O") && str[5].equals("O"))
                || !(str[6].equals("O") && str[7].equals("O") && str[8].equals("O"))
                || !(str[0].equals("O") && str[3].equals("O") && str[6].equals("O"))
                || !(str[1].equals("O") && str[4].equals("O") && str[7].equals("O"))
                || !(str[2].equals("O") && str[5].equals("O") && str[8].equals("O"))
                || !(str[0].equals("O") && str[4].equals("O") && str[8].equals("O"))
                || !(str[6].equals("O") && str[4].equals("O") && str[2].equals("O")))
                && (count_ == 0)) {
            System.out.println("Draw");
            countGame++;
        }
        if (countGame > 0) {
            return;
        }
        if ((!(str[0].equals("X") && str[1].equals("X") && str[2].equals("X"))
                || !(str[3].equals("X") && str[4].equals("X") && str[5].equals("X"))
                || !(str[6].equals("X") && str[7].equals("X") && str[8].equals("X"))
                || !(str[0].equals("X") && str[3].equals("X") && str[6].equals("X"))
                || !(str[1].equals("X") && str[4].equals("X") && str[7].equals("X"))
                || !(str[2].equals("X") && str[5].equals("X") && str[8].equals("X"))
                || !(str[0].equals("X") && str[4].equals("X") && str[8].equals("X"))
                || !(str[6].equals("X") && str[4].equals("X") && str[2].equals("X")))
                || (!(str[0].equals("O") && str[1].equals("O") && str[2].equals("O"))
                || !(str[3].equals("O") && str[4].equals("O") && str[5].equals("O"))
                || !(str[6].equals("O") && str[7].equals("O") && str[8].equals("O"))
                || !(str[0].equals("O") && str[3].equals("O") && str[6].equals("O"))
                || !(str[1].equals("O") && str[4].equals("O") && str[7].equals("O"))
                || !(str[2].equals("O") && str[5].equals("O") && str[8].equals("O"))
                || !(str[0].equals("O") && str[4].equals("O") && str[8].equals("O"))
                || !(str[6].equals("O") && str[4].equals("O") && str[2].equals("O")))
                && count_ > 0) {
            System.out.println("Game not finished");
            countGame++;
        }
    }
}

