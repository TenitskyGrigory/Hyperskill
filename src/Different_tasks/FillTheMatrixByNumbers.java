package src.Different_tasks;

import java.util.Scanner;

/**
 * Fill the matrix by numbers
 * Given the number n, not greater than 100, create a matrix of size n×n and fill it using the following rule.
 * Numbers 0 should be stored on the primary (main) diagonal. The two diagonals, adjacent to the primary one,
 * should contain numbers 1. The next two diagonals should contain numbers 2; etc.
 *
 * Note: the primary diagonal runs from the top left corner to the bottom right corner.
 */

public class FillTheMatrixByNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.abs(i - j);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
