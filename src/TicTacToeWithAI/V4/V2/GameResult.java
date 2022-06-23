package src.TicTacToeWithAI.V4.V2;

public enum GameResult {
    XWIN("X wins"),
    OWIN("O wins"),
    DRAW("Draw"),
    NOT_FINISHED("Game not finished");

    public String getMassage() {
        return message;
    }

    private final String message;
    GameResult(String message) {
        this.message = message;
    }
}
