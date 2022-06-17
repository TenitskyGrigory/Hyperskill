package src.TicTacToeWithAI.V2_V2;

import static src.TicTacToeWithAI.V2_V2.GameResult.DRAW;
import static src.TicTacToeWithAI.V2_V2.GameResult.NOT_FINISHED;
import static src.TicTacToeWithAI.V2_V2.GameResult.OWIN;
import static src.TicTacToeWithAI.V2_V2.GameResult.XWIN;

public class Launcher {
    public static void main(String[] args) {
        Field field = new Field();
        field.emptyField();
        field.printField();
        GameResult result = field.printResult(field);
        while (result != XWIN && result != OWIN && result != DRAW) {
            field.coordinates();
            result = field.printResult(field);
            if (result == NOT_FINISHED) {
                field.computerTurn();
                field.printField();
                result = field.printResult(field);
            }
        }
        field.printField();
        System.out.println(field.printResult(field).getMassage());
    }
}
