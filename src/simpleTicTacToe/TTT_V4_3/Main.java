package src.simpleTicTacToe.TTT_V4_3;

import java.util.Scanner;

import static src.simpleTicTacToe.TTT_V4_3.IsNumeric.isNumeric;

public class Main {
    private String st;

    public static void main(String[] args) {
        String[] str = new String[9];
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        FillingInTheField(st);
        for (int i = 0; i < str.length; i++) {
            str[i] = st.substring(i, i + 1);
        }
//        System.out.println("---------");
//        System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
//        System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
//        System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
//        System.out.println("---------");
        Scanner coordinates = new Scanner(System.in);
        int count = 0;
        do {
            System.out.print("Enter the coordinates: ");
            String coordinates1 = coordinates.next();
//            isNumeric(coordinates1);
            if (!isNumeric(coordinates1)) {
                continue;
            }

            String coordinates2 = coordinates.next();
            isNumeric(coordinates1, coordinates2);
//            if (!isNumeric(coordinates1, coordinates2)) {
//                continue;
//            }

//            if((!isNumeric(coordinates1))) {
//                System.out.println("You should enter numbers! 1");
//                break;
//            }


            int intValue1 = Integer.parseInt(coordinates1);

            int intValue2 = Integer.parseInt(coordinates2);

            if (intValue1 < 0 || intValue1 > 3 || intValue2 < 0 || intValue2 > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
//            if (isNumeric(coordinates1, coordinates2)) {
//                int intValue1 = Integer.parseInt(coordinates1);
//                int intValue2 = Integer.parseInt(coordinates2);
//                if (intValue1 < 0 || intValue1 > 3 || intValue2 < 0 || intValue2 > 3) {
//                    System.out.println("Coordinates should be from 1 to 3!");
//                    break;
//                }


            if (intValue1 == 1) {
                intValue1 = intValue1 * 10;
            } else if (intValue1 == 2) {
                intValue1 = intValue1 * 10;
            } else if (intValue1 == 3) {
                intValue1 = intValue1 * 10;
            }

//                int sum = intValue1 + intValue2;
//                CheckingValues(str, sum);
            switch (intValue1 + intValue2) {
                case 11:
                    if (str[0].equals("X") || str[0].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                        count--;
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
                        count--;
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
                        count--;
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
                        count--;
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
                        count--;
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
                        count--;
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
                        count--;
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
                        count--;
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
                        count--;
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
            count++;
//            }
        } while (count == 0);
    }

    private static void FillingInTheField(String st) {
        st = st;
        String[] str = new String[9];
//        Scanner scanner = new Scanner(System.in);
//        String st = scanner.nextLine();
        for (int i = 0; i < str.length; i++) {
            str[i] = st.substring(i, i + 1);
        }
        System.out.println("---------");
        System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
        System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
        System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
        System.out.println("---------");
    }
}

