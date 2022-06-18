package src.Different_tasks;

import java.util.Scanner;

/**
 * Cinema
 * The cinema has n rows, each row consists of m seats (n and m do not exceed 20).
 * A two-dimensional matrix stores the information on the sold tickets:
 * the number 1 means that the ticket for this place is already sold,
 * and the number 0 means that the place is available. You want to buy k tickets to neighboring seats in the same row.
 * Find whether it can be done.
 *
 * Input data format
 *
 * On the input, the program gets the number of n rows and m seats. Then, there are n lines,
 * each containing m numbers (0 or 1) separated by spaces. The last line contains the number k.
 *
 * Output data format
 *
 * The program should output the number of the row with k consecutive available seats.
 * If there are several rows with k available seats, output the first row with these seats.
 * If there is no such a row, output the number 0.
 */

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int seat = scanner.nextInt();
        int[][] cinema = new int[row][seat];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < seat; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }
        int consecutiveAvailableSeats = scanner.nextInt();
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < row; i++) {
            count3 = 0;
            if (count4 == 100) {
                break;
            }
            for (int j = 0; j < seat; j++) {
                if (cinema[i][j] == 0) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == consecutiveAvailableSeats) {
                    System.out.println(i + 1);
                    count4 = 100;
                    break;
                }
                count3++;
            }
            count = 0;
            count2++;
        }
        if (count2 == row && count3 == seat) {
            System.out.println(0);
        }
    }
}
