package src.TicTacToeWithAI.V3;

import java.util.Scanner;

import static src.TicTacToeWithAI.V3.GameResult.DRAW;
import static src.TicTacToeWithAI.V3.GameResult.NOT_FINISHED;
import static src.TicTacToeWithAI.V3.GameResult.OWIN;
import static src.TicTacToeWithAI.V3.GameResult.XWIN;

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
                        if (player1.equalsIgnoreCase("user") && player2.equalsIgnoreCase("user")) {
                            field.emptyField();
                            field.printField();
                            while (result != XWIN && result != OWIN && result != DRAW) {
                                field.printField();
                                field.coordinatesFirstPlayer();
                                field.printField();
                                result = field.printResult(field);
                                if (result == NOT_FINISHED) {
                                    field.coordinatesSecondPlayer();
                                    field.printField();
                                    result = field.printResult(field);
                                }
                            }
                            System.out.println(field.printResult(field).getMassage());
                        }
                        if (player1.equalsIgnoreCase("user") && player2.equalsIgnoreCase("easy")) {
                            field.emptyField();
                            field.printField();
                            while (result != XWIN && result != OWIN && result != DRAW) {
                                field.printField();
                                field.coordinatesFirstPlayer();
                                field.printField();
                                result = field.printResult(field);
                                if (result == NOT_FINISHED) {
                                    field.computerSecond();
                                    field.printField();
                                    result = field.printResult(field);
                                }
                            }
                            System.out.println(field.printResult(field).getMassage());
                        }
                        if (player1.equalsIgnoreCase("easy") && player2.equalsIgnoreCase("user")) {
                            field.emptyField();
                            field.printField();
                            while (result != XWIN && result != OWIN && result != DRAW) {
                                field.printField();
                                field.computerFirst();
                                field.printField();
                                result = field.printResult(field);
                                if (result == NOT_FINISHED) {
                                    field.coordinatesSecondPlayer();
                                    field.printField();
                                    result = field.printResult(field);
                                }
                            }
                            System.out.println(field.printResult(field).getMassage());
                        }
                        if (player1.equalsIgnoreCase("easy") && player2.equalsIgnoreCase("easy")) {
                            field.emptyField();
                            field.printField();
                            while (result != XWIN && result != OWIN && result != DRAW) {
                                field.computerFirst();
                                field.printField();
                                result = field.printResult(field);
                                if (result == NOT_FINISHED) {
                                    field.computerSecond();
                                    field.printField();
                                    result = field.printResult(field);
                                }
                            }
                            System.out.println(field.printResult(field).getMassage());
                        }
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
