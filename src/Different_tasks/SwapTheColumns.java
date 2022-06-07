package src.Different_tasks;

import java.util.Scanner;

/**
 * Swap the columns
 * Given a two-dimensional array (matrix) and the two numbers: i and j.
 * Swap the columns with indexes i and j within the matrix.
 *
 * Input contains matrix dimensions n and m, not exceeding 100,
 * then the elements of the matrix, then the indexes i and j.
 */

public class SwapTheColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int firstColumn = scanner.nextInt();
        int secondColumn = scanner.nextInt();
        int[][] newArray = new int[n][1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                newArray[i][j] = array[i][firstColumn];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = firstColumn; j == firstColumn; j++) {
                array[i][j] = array[i][secondColumn];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = secondColumn; j == secondColumn; j++) {
                array[i][j] = newArray[i][0];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
