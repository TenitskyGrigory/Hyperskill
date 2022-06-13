package src.simpleTicTacToe.TTT_V5;

import java.util.Scanner;

/**
 * Description
 * Our game is almost ready! Now let's combine what we’ve learned in the previous stages
 * to make a game of tic-tac-toe that two players can play from the beginning (with an empty grid) through
 * to the end (until there is a draw, or one of the players wins).
 *
 * The first player has to play as X and their opponent plays as O.
 *
 * Objectives
 * In this stage, you should write a program that:
 *
 * Prints an empty grid at the beginning of the game.
 * Creates a game loop where the program asks the user to enter the cell coordinates,
 * analyzes the move for correctness and shows a grid with the changes if everything is okay.
 * Ends the game when someone wins or there is a draw.
 * You need to output the final result at the end of the game.
 */

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String cells = "         ";
    showBoard(boardChar(cells));
    char[][] boardChar_1 = boardChar(cells);
    boolean check = true;
    int count = 0;
        while (check) {
            System.out.println("Enter the coordinate: ");
            switch (count % 2) {
                case 0:
                    try {
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
                        int row = scanner.nextInt();
                        int column = scanner.nextInt();
                        if (row < 1 || row > 3 || column < 1 || column > 3) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else {
                        if (userInputO(row, column, boardChar_1) == 0) {
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
            System.out.println("This cell is occupied! Choose another one!");
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
