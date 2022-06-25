package src.TicTacToeWithAI.V4.V3;

import java.util.Random;
import java.util.Scanner;

import static src.TicTacToeWithAI.V4.V3.GameResult.DRAW;
import static src.TicTacToeWithAI.V4.V3.GameResult.NOT_FINISHED;
import static src.TicTacToeWithAI.V4.V3.GameResult.OWIN;
import static src.TicTacToeWithAI.V4.V3.GameResult.XWIN;

public class Field {
    Scanner scanner = new Scanner(System.in);
    char[][] field = new char[3][3];
    Coordinates gameCoordinates;

    public void emptyField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = ' ';
            }
        }
    }

    public void printField() {
        System.out.println("---------");
        for (int i = 0; i < field.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public void coordinatesFirstPlayer() {
        String coordinates;
        boolean correctInput = false;
        do {
            System.out.print("Enter the coordinates: > ");
            coordinates = scanner.nextLine();
            if (!checkCoordinates(coordinates)) {
                gameCoordinates = new Coordinates(Integer.parseInt(String.valueOf(coordinates.charAt(0))), Integer.parseInt(String.valueOf(coordinates.charAt(2))));
                if (!checkIfOccupied(gameCoordinates.getY(), gameCoordinates.getX())) {
                    field[gameCoordinates.getY()][gameCoordinates.getX()] = 'X';
                    correctInput = true;
                }
            }
        }
        while (!correctInput);
    }

    public void computerFirstEasyLevel() {
        Random random = new Random();
        System.out.println("Making move level \"easy\"");
        while (true) {
            int column = random.nextInt(3);
            int row = random.nextInt(3);
            if (field[column][row] == ' ') {
                field[column][row] = 'X';
                break;
            }
        }
    }

    public void computerSecondEasyLevel() {
        Random random = new Random();
        System.out.println("Making move level \"easy\"");
        while (true) {
            int column = random.nextInt(3);
            int row = random.nextInt(3);
            if (field[column][row] == ' ') {
                field[column][row] = 'O';
                break;
            }
        }
    }

    public void computerFirstMediumLevel() {
        Random random = new Random();
        System.out.println("Making move level \"medium\"");
        int count = 0;
                    for (int i = 0; i < 3; i++) {
                        if (field[0][i] == 'X' && field[1][i] == 'X' && field[2][i] == ' ') {
                            field[2][i] = 'X';
                            count++;
                            break;
                        } else if (field[0][i] == 'X' && field[2][i] == 'X' && field[1][i] == ' ') {
                            field[1][i] = 'X';
                            count++;
                            break;
                        } else if (field[1][i] == 'X' && field[2][i] == 'X' && field[0][i] == ' ') {
                            field[0][i] = 'X';
                            count++;
                            break;
                        } else if (field[i][0] == 'X' && field[i][1] == 'X' && field[i][2] == ' ') {
                            field[i][2] = 'X';
                            count++;
                            break;
                        } else if (field[i][0] == 'X' && field[i][2] == 'X' && field[i][1] == ' ') {
                            field[i][1] = 'X';
                            count++;
                            break;
                        } else if (field[i][1] == 'X' && field[i][2] == 'X' && field[i][0] == ' ') {
                            field[i][0] = 'X';
                            count++;
                            break;
                        } else if (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == ' ') {
                            field[2][2] = 'X';
                            count++;
                            break;
                        } else if (field[0][0] == 'X' && field[2][2] == 'X' && field[1][1] == ' ') {
                            field[1][1] = 'X';
                            count++;
                            break;
                        } else if (field[1][1] == 'X' && field[2][2] == 'X' && field[0][0] == ' ') {
                            field[0][0] = 'X';
                            count++;
                            break;
                        } else  if (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == ' ') {
                            field[2][0] = 'X';
                            count++;
                            break;
                        } else if (field[0][2] == 'X' && field[2][0] == 'X' && field[1][1] == ' ') {
                            field[1][1] = 'X';
                            count++;
                            break;
                        } else if (field[1][1] == 'X' && field[2][0] == 'X' && field[0][2] == ' ') {
                            field[0][2] = 'X';
                            count++;
                            break;
                        }
                    }
        if (count == 0) {
            for (int i = 0; i < 3; i++) {
                if (field[0][i] == 'O' && field[1][i] == 'O' && field[2][i] == ' ') {
                    field[2][i] = 'X';
                    count++;
                    break;
                } else if (field[0][i] == 'O' && field[2][i] == 'O' && field[1][i] == ' ') {
                    field[1][i] = 'X';
                    count++;
                    break;
                } else if (field[1][i] == 'O' && field[2][i] == 'O' && field[0][i] == ' ') {
                    field[0][i] = 'X';
                    count++;
                    break;
                } else if (field[i][0] == 'O' && field[i][1] == 'O' && field[i][2] == ' ') {
                    field[i][2] = 'X';
                    count++;
                    break;
                } else if (field[i][0] == 'O' && field[i][2] == 'O' && field[i][1] == ' ') {
                    field[i][1] = 'X';
                    count++;
                    break;
                } else if (field[i][1] == 'O' && field[i][2] == 'O' && field[i][0] == ' ') {
                    field[i][0] = 'X';
                    count++;
                    break;
                } else if (field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == ' ') {
                    field[2][2] = 'X';
                    count++;
                    break;
                } else if (field[0][0] == 'O' && field[2][2] == 'O' && field[1][1] == ' ') {
                    field[1][1] = 'X';
                    count++;
                    break;
                } else if (field[1][1] == 'O' && field[2][2] == 'O' && field[0][0] == ' ') {
                    field[0][0] = 'X';
                    count++;
                    break;
                } else if (field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == ' ') {
                    field[2][0] = 'X';
                    count++;
                    break;
                } else if (field[0][2] == 'O' && field[2][0] == 'O' && field[1][1] == ' ') {
                    field[1][1] = 'X';
                    count++;
                    break;
                } else if (field[1][1] == 'O' && field[2][0] == 'O' && field[0][2] == ' ') {
                    field[0][2] = 'X';
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            while (true) {
                int column = random.nextInt(3);
                int row = random.nextInt(3);
                if (field[column][row] == ' ') {
                    field[column][row] = 'X';
                    break;
                }
            }
        }
    }


    public void computerSecondMediumLevel() {
        Random random = new Random();
        System.out.println("Making move level \"medium\"");
        int count = 0;
                    for (int i = 0; i < 3; i++) {
                        if (field[0][i] == 'O' && field[1][i] == 'O' && field[2][i] == ' ') {
                            field[2][i] = 'O';
                            count++;
                            break;
                        } else if (field[0][i] == 'O' && field[2][i] == 'O' && field[1][i] == ' ') {
                            field[1][i] = 'O';
                            count++;
                            break;
                        } else if (field[1][i] == 'O' && field[2][i] == 'O' && field[0][i] == ' ') {
                            field[0][i] = 'O';
                            count++;
                            break;
                        } else if (field[i][0] == 'O' && field[i][1] == 'O' && field[i][2] == ' ') {
                            field[i][2] = 'O';
                            count++;
                            break;
                        } else if (field[i][0] == 'O' && field[i][2] == 'O' && field[i][1] == ' ') {
                            field[i][1] = 'O';
                            count++;
                            break;
                        } else if (field[i][1] == 'O' && field[i][2] == 'O' && field[i][0] == ' ') {
                            field[i][0] = 'O';
                            count++;
                            break;
                        } else if (field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == ' ') {
                            field[2][2] = 'O';
                            count++;
                            break;
                        } else if (field[0][0] == 'O' && field[2][2] == 'O' && field[1][1] == ' ') {
                            field[1][1] = 'O';
                            count++;
                            break;
                        } else if (field[1][1] == 'O' && field[2][2] == 'O' && field[0][0] == ' ') {
                            field[0][0] = 'O';
                            count++;
                            break;
                        } else if (field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == ' ') {
                            field[2][0] = 'O';
                            count++;
                            break;
                        } else if (field[0][2] == 'O' && field[2][0] == 'O' && field[1][1] == ' ') {
                            field[1][1] = 'O';
                            count++;
                            break;
                        } else if (field[1][1] == 'O' && field[2][0] == 'O' && field[0][2] == ' ') {
                            field[0][2] = 'O';
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        for (int i = 0; i < 3; i++) {
                            if (field[0][i] == 'X' && field[1][i] == 'X' && field[2][i] == ' ') {
                                field[2][i] = 'O';
                                count++;
                                break;
                            } else if (field[0][i] == 'X' && field[2][i] == 'X' && field[1][i] == ' ') {
                                field[1][i] = 'O';
                                count++;
                                break;
                            } else if (field[1][i] == 'X' && field[2][i] == 'X' && field[0][i] == ' ') {
                                field[0][i] = 'O';
                                count++;
                                break;
                            } else if (field[i][0] == 'X' && field[i][1] == 'X' && field[i][2] == ' ') {
                                field[i][2] = 'O';
                                count++;
                                break;
                            } else if (field[i][0] == 'X' && field[i][2] == 'X' && field[i][1] == ' ') {
                                field[i][1] = 'O';
                                count++;
                                break;
                            } else if (field[i][1] == 'X' && field[i][2] == 'X' && field[i][0] == ' ') {
                                field[i][0] = 'O';
                                count++;
                                break;
                            } else if (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == ' ') {
                                field[2][2] = 'O';
                                count++;
                                break;
                            } else if (field[0][0] == 'X' && field[2][2] == 'X' && field[1][1] == ' ') {
                                field[1][1] = 'O';
                                count++;
                                break;
                            } else if (field[1][1] == 'X' && field[2][2] == 'X' && field[0][0] == ' ') {
                                field[0][0] = 'O';
                                count++;
                                break;
                            } else if (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == ' ') {
                                field[2][0] = 'O';
                                count++;
                                break;
                            } else if (field[0][2] == 'X' && field[2][0] == 'X' && field[1][1] == ' ') {
                                field[1][1] = 'O';
                                count++;
                                break;
                            } else if (field[1][1] == 'X' && field[2][0] == 'X' && field[0][2] == ' ') {
                                field[0][2] = 'O';
                                count++;
                                break;
                            }
                        }
                    }

                    if (count == 0) {
                        while (true) {
                            int column = random.nextInt(3);
                            int row = random.nextInt(3);
                            if (field[column][row] == ' ') {
                                field[column][row] = 'O';
                                break;
                            }
                        }
                    }
    }

    public boolean checkCoordinates(String coordinates) {
        String[] coordinateArray = coordinates.split(" ");
        int i, j;
        try {
            i = Integer.parseInt(coordinateArray[0]);
            j = Integer.parseInt(coordinateArray[1]);
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers!");
            return true;
        }
        return false;
    }

    public boolean checkIfOccupied(int y, int x) {
        try {
            System.out.println(field[y][x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Coordinates should be from 1 to 3!");
            return true;
        }
        if (field[gameCoordinates.getY()][gameCoordinates.getX()] != ' ') {
            System.out.println("This cell is occupied! Choose another one!");
            return true;
        }
        return false;
    }

    public void coordinatesSecondPlayer() {
        String coordinates;
        boolean correctInput = false;
        do {
            System.out.print("Enter the coordinates: > ");
            coordinates = scanner.nextLine();
            if (!checkCoordinates(coordinates)) {
                gameCoordinates = new Coordinates(Integer.parseInt(String.valueOf(coordinates.charAt(0))), Integer.parseInt(String.valueOf(coordinates.charAt(2))));
                if (!checkIfOccupied(gameCoordinates.getY(), gameCoordinates.getX())) {
                    field[gameCoordinates.getY()][gameCoordinates.getX()] = 'O';
                    correctInput = true;
                }
            }
        }
        while (!correctInput);
    }

    public GameResult printResult (Field gameField) {
        for (int i = 0; i < 3; i++) {
            if (field[0][i] + field[1][i] + field[2][i] == 264) {
                return XWIN;
            }
            if (field[0][i] + field[1][i] + field[2][i] == 237) {
                return OWIN;
            }
            if (field[i][0] + field[i][1] + field[i][2] == 264) {
                return XWIN;
            }
            if (field[i][0] + field[i][1] + field[i][2] == 237) {
                return OWIN;
            }
        }
        if (field[0][0] + field[1][1] + field[2][2] == 264
                || field[0][2] + field[1][1] + field[2][0] == 264) {
            return XWIN;
        }
        if (field[0][0] + field[1][1] + field[2][2] == 237
                || field[0][2] + field[1][1] + field[2][0] == 237) {
            return OWIN;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == ' ') {
                    return NOT_FINISHED;
                }
            }
        }
        return DRAW;
    }

    public void alreadyToWin(Field gameField) {
        field[4][4] = ' ';
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == 'O' && field[1][i] == 'O' && field[2][i] == ' ') {
                field[2][i] = 'O';
                break;
            } else if (field[0][i] == 'O' && field[2][i] == 'O' && field[1][i] == ' ') {
                field[1][i] = 'O';
                break;
            } else if (field[1][i] == 'O' && field[2][i] == 'O' && field[0][i] == ' ') {
                field[0][i] = 'O';
                break;
            } else if (field[i][0] == 'O' && field[i][1] == 'O' && field[i][2] == ' ') {
                field[i][2] = 'O';
                break;
            } else if (field[i][0] == 'O' && field[i][2] == 'O' && field[i][1] == ' ') {
                field[i][1] = 'O';
                break;
            } else if (field[i][1] == 'O' && field[i][2] == 'O' && field[i][0] == ' ') {
                field[i][0] = 'O';
                break;
            } else if (field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == ' ') {
                field[2][2] = 'O';
                break;
            } else if (field[0][0] == 'O' && field[2][2] == 'O' && field[1][1] == ' ') {
                field[1][1] = 'O';
                break;
            } else if (field[1][1] == 'O' && field[2][2] == 'O' && field[0][0] == ' ') {
                field[0][0] = 'O';
                break;
            } else if (field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == ' ') {
                field[2][0] = 'O';
                break;
            } else if (field[0][2] == 'O' && field[2][0] == 'O' && field[1][1] == ' ') {
                field[1][1] = 'O';
                break;
            } else if (field[1][1] == 'O' && field[2][0] == 'O' && field[0][2] == ' ') {
                field[0][2] = 'O';
                break;
            }
        }
    }
}
