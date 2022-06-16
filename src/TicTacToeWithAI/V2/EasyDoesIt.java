package src.TicTacToeWithAI.V2;

import java.util.Random;
import java.util.Scanner;

/**
 * Description
 * Now it's time to make a working game, so let's create our first opponent! In this version of the program,
 * the user will be playing as X, and the computer will be playing as O at easy level. This will be our first small step towards creating the AI!
 *
 * Let's design it so that at this level the computer makes random moves. This should be perfect for people who have never played the game before!
 *
 * If you want, you could make the game even simpler by including a difficulty level where the computer never wins.
 * Feel free to create this along with the easy level if you like, but it won't be tested.
 *
 * Objectives
 * In this stage, you should implement the following:
 *
 * Display an empty table when the program starts.
 * The user plays first as X, and the program should ask the user to enter cell coordinates.
 * Next, the computer makes its move as O, and the players then move in turn until someone wins or the game results in a draw.
 * Print the final outcome at the very end of the game.
 */

public class EasyDoesIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cells = "         ";
        showBoard(boardChar(cells));
        char[][] boardChar_1 = boardChar(cells);
        boolean check = true;
        int count = 0;
        for (int i = 0; i < cells.length(); i++) {
            if(cells.charAt(i) == 'X' || cells.charAt(i) == 'O') {
                count++;
            }
        }
        while (check) {
            switch (count % 2) {
                case 0:
                    try {
                        System.out.print("Enter the coordinates: > ");
                        int row = scanner.nextInt();
                        int column = scanner.nextInt();
                        if (row < 1 || row > 3 || column < 1 || column > 3) {
                            System.out.println("Coordinates should be from 1 to 3!");
                        } else {
                            if (userInputX(row, column, boardChar_1) == 0) {
                                showBoard(boardChar_1);
                                count++;
                            }
                        }
                    } catch (Exception NumberFormatException) {
                        System.out.println("You should enter numbers!");
                        scanner.nextLine();
                    }
                    if ((boardChar_1[0][0] == 'X' && boardChar_1[0][1] == 'X' && boardChar_1[0][2] == 'X')
                            || (boardChar_1[1][0] == 'X' && boardChar_1[1][1] == 'X' && boardChar_1[1][2] == 'X')
                            || (boardChar_1[2][0] == 'X' && boardChar_1[2][1] == 'X' && boardChar_1[2][2] == 'X')
                            || (boardChar_1[0][0] == 'X' && boardChar_1[1][0] == 'X' && boardChar_1[2][0] == 'X')
                            || (boardChar_1[0][1] == 'X' && boardChar_1[1][1] == 'X' && boardChar_1[2][1] == 'X')
                            || (boardChar_1[0][2] == 'X' && boardChar_1[1][2] == 'X' && boardChar_1[2][2] == 'X')
                            || (boardChar_1[0][0] == 'X' && boardChar_1[1][1] == 'X' && boardChar_1[2][2] == 'X')
                            || (boardChar_1[2][0] == 'X' && boardChar_1[1][1] == 'X' && boardChar_1[0][2] == 'X')) {
                        System.out.println("X wins");
                        check = false;
                        break;
                    }
                    if (count == 9) {
                        System.out.println("Draw");
                        check = false;
                        break;
                    }
                    break;
                case 1:
                    try {
                        int min = 1;
                        int max = 3;
                        Random random = new Random();
                        int intervalLength = (max - min + 1) + min;
                        int row = random.nextInt(intervalLength);
                        int column = random.nextInt(intervalLength);
                        if (row < 1 || row > 3 || column < 1 || column > 3) {
                        } else {
                            if (userInputO(row, column, boardChar_1) == 0) {
                                System.out.println("Making move level \"easy\"");
                                showBoard(boardChar_1);
                                count++;
                            }
                        }
                    } catch (Exception NumberFormatException) {
                        System.out.println("You should enter numbers!");
                        scanner.nextLine();
                    }
                    if ((boardChar_1[0][0] == 'O' && boardChar_1[0][1] == 'O' && boardChar_1[0][2] == 'O')
                            || (boardChar_1[1][0] == 'O' && boardChar_1[1][1] == 'O' && boardChar_1[1][2] == 'O')
                            || (boardChar_1[2][0] == 'O' && boardChar_1[2][1] == 'O' && boardChar_1[2][2] == 'O')
                            || (boardChar_1[0][0] == 'O' && boardChar_1[1][0] == 'O' && boardChar_1[2][0] == 'O')
                            || (boardChar_1[0][1] == 'O' && boardChar_1[1][1] == 'O' && boardChar_1[2][1] == 'O')
                            || (boardChar_1[0][2] == 'O' && boardChar_1[1][2] == 'O' && boardChar_1[2][2] == 'O')
                            || (boardChar_1[0][0] == 'O' && boardChar_1[1][1] == 'O' && boardChar_1[2][2] == 'O')
                            || (boardChar_1[2][0] == 'O' && boardChar_1[1][1] == 'O' && boardChar_1[0][2] == 'O')) {
                        System.out.println("O wins");
                        check = false;
                        break;
                    }
                    if(count == 9) {
                        System.out.println("Draw");
                        check = false;
                        break;
                    }
                    break;
            }
        }
    }
    public static int userInputX(int row, int column, char[][] boardChar) {
        int check;
        if (boardChar[row - 1][column - 1] != ' ') {
            System.out.println("This cell is occupied! Choose another one!");
            check = 1;
        } else {
            boardChar[row - 1][column - 1] = 'X';
            check = 0;
        }
        return check;
    }

    public static int userInputO(int row, int column, char[][] boardChar) {
        int check;
        if (boardChar[row - 1][column - 1] != ' ') {
            check = 1;
        } else {
            boardChar[row - 1][column - 1] = 'O';
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
