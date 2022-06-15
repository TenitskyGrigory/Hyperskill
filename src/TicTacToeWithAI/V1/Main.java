package src.TicTacToeWithAI.V1;

import java.util.Scanner;

/**
 * Description
 * In this project, you'll write a game called Tic-Tac-Toe that you can play against your computer.
 * The computer will have three levels of difficulty — easy, medium, and hard.
 *
 * To begin with, let's write a program that knows how to work with coordinates and determine the state of the game.
 *
 * The top-left cell will have the coordinates (1, 1) and the bottom-right cell will have the coordinates (3, 3), as shown in this table:
 *
 * (1, 1) (1, 2) (1, 3)
 * (2, 1) (2, 2) (2, 3)
 * (3, 1) (3, 2) (3, 3)
 *
 * The program should ask the user to enter the coordinates of the cell where they want to make a move.
 *
 * Keep in mind that the first coordinate goes from top to bottom, and the second coordinate goes from left to right.
 * Also, notice that coordinates start with 1 and can be 1, 2, or 3.
 *
 * But what if the user attempts to enter invalid coordinates?
 * This could happen if they try to enter letters or symbols instead of numbers, or the coordinates of an already occupied cell.
 * Your program needs to prevent these things from happening by checking the user's input and catching possible exceptions.
 *
 * Objectives
 * The program should work in the following way:
 *
 * Ask the user to provide the initial state of the 3x3 table with the first input line.
 * This must include nine symbols that can be X, O or _ (the latter represents an empty cell).
 * Output the specified 3x3 table before the user makes a move.
 * Request that the user enters the coordinates of the move they wish to make.
 * The user then inputs two numbers representing the cell in which they wish to place their X or O.
 * The game always starts with X, so the user's move should be made with this symbol if there are an equal number of X's and O's in the table.
 * If the table contains an extra X, the move should be made with O.
 * Analyze the user input and show messages in the following situations:
 * • This cell is occupied! Choose another one! — if the cell is not empty;
 * • You should enter numbers! — if the user tries to enter letters or symbols instead of numbers;
 * • Coordinates should be from 1 to 3! — if the user attempts to enter coordinates outside of the table's range.
 * Display the table again with the user's most recent move included.
 * Output the state of the game.
 * The possible states are:
 *
 * Game not finished — when no side has three in a row, but the table still has empty cells;
 * Draw — when no side has three in a row, and the table is complete;
 * X wins — when there are three X's in a row (up, down, across, or diagonally);
 * O wins — when there are three O's in a row (up, down, across, or diagonally).
 * If the user provides invalid coordinates, the program should repeat the request until numbers that represent
 * an empty cell on the table are supplied. You should ensure that the program only outputs the table twice — before the
 * move and after the user makes a legal move.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String cells = scanner.nextLine();
        showBoard(boardChar(cells));
        char[][] boardChar_1 = boardChar(cells);
        boolean check = true;
        int count = 0;
        for (int i = 0; i < cells.length(); i++) {
            if(cells.charAt(i) == 'X' || cells.charAt(i) == 'O') {
                count++;
            }
        }
        int count2 = count;
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
            if( count2 != count) {
                System.out.println("Game not finished");
                break;
            }
        }
    }
    public static int userInputX(int row, int column, char[][] boardChar) {
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

    public static int userInputO(int row, int column, char[][] boardChar) {
        int check;
        if (boardChar[row - 1][column - 1] != '_') {
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

