package src.simpleTicTacToe.TTT_V4;

import java.util.Scanner;

import static src.simpleTicTacToe.TTT_V4.IsNumeric.isNumeric;


public class Main {
    public static void main(String[] args) {
        String[] str = new String[9];
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        for (int i = 0; i < str.length; i++) {
            str[i] = st.substring(i, i + 1);
        }
        System.out.println("---------");
        System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
        System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
        System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
        System.out.println("---------");
        System.out.print("Enter the coordinates: ");
        Scanner coordinates = new Scanner(System.in);
        do {
        String coordinates1 = coordinates.next();
        String coordinates2 = coordinates.next();
        if(!isNumeric(coordinates1)){
            System.out.println("You should enter numbers!");
        } else if(!isNumeric(coordinates1)){
            System.out.println("You should enter numbers!");
        }

            if (isNumeric(coordinates1) && isNumeric(coordinates2)) {
                int intValue1 = Integer.parseInt(coordinates1);
                int intValue2 = Integer.parseInt(coordinates2);
                if (intValue1 < 0 || intValue1 > 3 || intValue2 < 0 || intValue2 > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                }

                if (intValue1 == 1) {
                    intValue1 = intValue1 * 10;
                } else if (intValue1 == 2) {
                    intValue1 = intValue1 * 20;
                } else if (intValue1 == 3) {
                    intValue1 = intValue1 * 30;
                }

                switch (intValue1 + intValue2) {
                    case 11:
                        if (str[0].equals("X") || str[0].equals("O")) {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            str[0] = "X";
                            System.out.println("---------");
                            System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
                            System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
                            System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
                            System.out.println("---------");
                        }
                        break;
                    case 12:
                        if (str[1].equals("X") || str[1].equals("O")) {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            str[1] = "X";
                            System.out.println("---------");
                            System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
                            System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
                            System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
                            System.out.println("---------");
                        }
                        break;
                    case 13:
                        if (str[2].equals("X") || str[2].equals("O")) {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            str[2] = "X";
                            System.out.println("---------");
                            System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
                            System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
                            System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
                            System.out.println("---------");
                        }
                        break;
                    case 21:
                        if (str[3].equals("X") || str[3].equals("O")) {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            str[3] = "X";
                            System.out.println("---------");
                            System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
                            System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
                            System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
                            System.out.println("---------");
                        }
                        break;
                    case 22:
                        if (str[4].equals("X") || str[4].equals("O")) {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            str[4] = "X";
                            System.out.println("---------");
                            System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
                            System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
                            System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
                            System.out.println("---------");
                        }
                        break;
                    case 23:
                        if (str[5].equals("X") || str[5].equals("O")) {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            str[5] = "X";
                            System.out.println("---------");
                            System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
                            System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
                            System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
                            System.out.println("---------");
                        }
                        break;
                    case 31:
                        if (str[6].equals("X") || str[6].equals("O")) {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            str[6] = "X";
                            System.out.println("---------");
                            System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
                            System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
                            System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
                            System.out.println("---------");
                        }
                        break;
                    case 32:
                        if (str[7].equals("X") || str[7].equals("O")) {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            str[7] = "X";
                            System.out.println("---------");
                            System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
                            System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
                            System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
                            System.out.println("---------");
                        }
                        break;
                    case 33:
                        if (str[8].equals("X") || str[8].equals("O")) {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            str[8] = "X";
                            System.out.println("---------");
                            System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
                            System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
                            System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
                            System.out.println("---------");
                        }
                        break;
                }
            }
        } while (false);
    }
}
