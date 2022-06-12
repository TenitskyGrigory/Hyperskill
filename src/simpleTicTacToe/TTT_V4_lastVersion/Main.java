package src.simpleTicTacToe.TTT_V4_lastVersion;

import java.util.Scanner;

/**
 * Description
 * It’s time to make our game interactive! Now we’re going to add the ability for a user to make a move.
 *
 * To do this, we need to divide the grid into cells.
 *
 * Suppose the top left cell has the coordinates (1, 1) and the bottom right cell has the coordinates (3, 3) like in this table:
 *
 * (1, 1) (1, 2) (1, 3)
 * (2, 1) (2, 2) (2, 3)
 * (3, 1) (3, 2) (3, 3)
 *
 * The program should ask the user to enter the coordinates of the cell where they want to make a move.
 *
 * In this stage, the user plays as X, not O. Keep in mind that the first coordinate goes from top
 * to bottom and the second coordinate goes from left to right. Also note that coordinates start with 1 and can be 1, 2, or 3.
 *
 * What happens if the user enters incorrect coordinates? The user could enter symbols instead of numbers,
 * or enter coordinates representing occupied cells or cells that aren’t even on the grid.
 * You need to check the user's input and handle possible errors.
 *
 * Objectives
 * The program should work as follows:
 *
 * Get the 3x3 grid from the input as in the previous stages.
 * Output this 3x3 grid as in the previous stages.
 * Prompt the user to make a move.
 * The user should input 2 numbers that represent the cell where they want to place their X.
 * (the 9 symbols representing the field will be the first line of input, and the 2 coordinate numbers will be the second line of input)
 * Analyze user input and show messages in the following situations:
 * This cell is occupied! Choose another one! if the cell is not empty.
 * You should enter numbers! if the user enters non-numeric symbols in the coordinates input.
 * Coordinates should be from 1 to 3! if the user enters coordinates outside the game grid.
 * Update the grid to include the user's move and print the updated grid to the console.
 * The program should also check the user’s input. If the input is unsuitable,
 * the program should tell the user why their input was wrong, and prompt them to enter coordinates again.
 *
 * To summarize, you need to output the game grid based on the first line of input,
 * and then ask the user to enter a move. Keep asking until the user enters coordinates that represent an empty cell on the grid,
 * update the grid to include that move, and then output it to the console. You should output the field only 2 times:
 * once before the user’s move, and once after the user has entered a legal move.
 */

public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter cells: ");
    String cells = scanner.nextLine();
    showBoard(boardChar(cells));
    char[][] boardChar_1 = boardChar(cells);
    boolean check = true;
    while (check) {
        System.out.println("Enter the coordinate: ");
        try {
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            if (row < 1 ||row > 3 || column < 1 || column > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else {
                if (userInput(row, column, boardChar_1) == 0) {
                    check = false;
                    showBoard(boardChar_1);
                }
            }
        } catch (Exception NumberFormatException) {
            System.out.println("You should enter numbers!");
            scanner.nextLine();
        }
    }
}
    public static int userInput(int row, int column, char[][] boardChar) {
        int check;
        if (boardChar[row - 1][column - 1] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            check = 1;
        } else {
            boardChar[row - 1][column - 1] = 'X';
            check = 0;
        }
        return check;
    }

    public static void showBoard(char[][] xoBoard) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(xoBoard[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static char[][] boardChar(String cells) {
        char[][] xoBoard = new char[3][3];
        for (int n = 0; n < 3; n++) {
            for (int m = 0; m < 3; m++) {
                xoBoard[n][m] = cells.charAt(m + n * 3);
            }
        }
        return xoBoard;
    }
}

