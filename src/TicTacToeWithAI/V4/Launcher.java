package src.TicTacToeWithAI.V4;

import java.util.Scanner;

import static src.TicTacToeWithAI.V4.GameResult.DRAW;
import static src.TicTacToeWithAI.V4.GameResult.NOT_FINISHED;
import static src.TicTacToeWithAI.V4.GameResult.OWIN;
import static src.TicTacToeWithAI.V4.GameResult.XWIN;

/**
 * Description
 * Let's write the medium difficulty level now. To do this, we need to add awareness to our AI.
 *
 * This level will be a lot harder to beat than easy, even though the initial moves are still random.
 * When the AI is playing at medium level, it wins when it can because of its first rule,
 * and stops all simple attempts to beat it due to its second.
 *
 * You can see these rules below.
 *
 * Objectives
 * When the AI is playing at medium difficulty level, it makes moves using the following logic:
 *
 * If it already has two in a row and can win with one further move, it does so.
 * If its opponent can win with one move, it plays the move necessary to block this.
 * Otherwise, it makes a random move.
 * You should add a medium parameter so that you can play against this level.
 * It should also be possible to make AIs using easy and medium levels play against each other!
 */

public class Launcher {
    public static void main(String[] args) {
        Field field = new Field();
        field.emptyField();
        GameResult result = field.printResult(field);
        Scanner in = new Scanner(System.in);

        String userInput;
        do {
            System.out.print("Input command: > ");
            userInput = in.nextLine();

            String[] tokens = userInput. split(" ");
            String command = tokens[0];
            switch (command) {
                case "start":
                    try {
                        String player1 = tokens[1];
                        String player2 = tokens[2];
                        while (result != XWIN && result != OWIN && result != DRAW) {
                            field.emptyField();
                            field.printField();
//                                field.printField();
                            if (player1.equalsIgnoreCase("user")) {
                                field.coordinatesFirstPlayer();
                            } else if (player1.equalsIgnoreCase("easy")) {
                                field.computerFirst();
                            }
                            field.printField();
                            result = field.printResult(field);
                            if (result != XWIN && result != OWIN && result != DRAW) {
                                if (player2.equalsIgnoreCase("user")) {
                                    field.coordinatesSecondPlayer();
                                } else if (player2.equalsIgnoreCase("easy")) {
                                    field.computerSecond();
                                }
                                field.printField();
                                result = field.printResult(field);
                            }
                        }
                        System.out.println(field.printResult(field).getMassage());


//                        if (player1.equalsIgnoreCase("user") && player2.equalsIgnoreCase("easy")) {
//                            field.emptyField();
//                            field.printField();
//                            while (result != XWIN && result != OWIN && result != DRAW) {
//                                field.printField();
//                                field.coordinatesFirstPlayer();
//                                field.printField();
//                                result = field.printResult(field);
//                                if (result == NOT_FINISHED) {
//                                    field.computerSecond();
//                                    field.printField();
//                                    result = field.printResult(field);
//                                }
//                            }
//                            System.out.println(field.printResult(field).getMassage());
//                        }
//                        if (player1.equalsIgnoreCase("easy") && player2.equalsIgnoreCase("user")) {
//                            field.emptyField();
//                            field.printField();
//                            while (result != XWIN && result != OWIN && result != DRAW) {
//                                field.printField();
//                                field.computerFirst();
//                                field.printField();
//                                result = field.printResult(field);
//                                if (result == NOT_FINISHED) {
//                                    field.coordinatesSecondPlayer();
//                                    field.printField();
//                                    result = field.printResult(field);
//                                }
//                            }
//                            System.out.println(field.printResult(field).getMassage());
//                        }
//                        if (player1.equalsIgnoreCase("easy") && player2.equalsIgnoreCase("easy")) {
//                            field.emptyField();
//                            field.printField();
//                            while (result != XWIN && result != OWIN && result != DRAW) {
//                                field.computerFirst();
//                                field.printField();
//                                result = field.printResult(field);
//                                if (result == NOT_FINISHED) {
//                                    field.computerSecond();
//                                    field.printField();
//                                    result = field.printResult(field);
//                                }
//                            }
//                            System.out.println(field.printResult(field).getMassage());
//                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Bad parameters!");
                    }
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Bad parameters!");
            }
        } while (!userInput.equalsIgnoreCase("exit"));
    }
}
