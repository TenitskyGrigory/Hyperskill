package src.simpleTicTacToe;

/**
 * Description
 * Our program should be able to display the grid at all stages of the game.
 * Now we’re going to write a program that allows the user to enter a string representing
 * the game state and correctly prints the 3x3 game grid based on this input.
 * We’ll also add some boundaries around the game grid.
 *
 * Objectives
 * In this stage, you will write a program that:
 *
 * Reads a string of 9 symbols from the input and displays them to the user in a 3x3 grid.
 * The grid can contain only X, O and _ symbols.
 * Outputs a line of dashes --------- above and below the grid, adds a pipe
 * | symbol to the beginning and end of each line of the grid, and adds a space between all characters in the grid.
 */

import java.util.Scanner;

public class TheUserIsTheGameMaster {
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
    }
}
