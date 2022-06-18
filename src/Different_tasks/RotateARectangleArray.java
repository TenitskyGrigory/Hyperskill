package src.Different_tasks;

/**
 * Rotate a rectangle array
 * Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise,
 * by recording the result into the new array m×n in size.
 *
 * Input data format
 *
 * Input consists of the two numbers n and m, not exceeding 100, and then an array n×m in size.
 *
 * Output data format
 *
 * Output the resulting array. Separate numbers by a single space in the output.
 */

import java.util.Scanner;

public class RotateARectangleArray {
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
        int[][] newArray = new int[m][n];
        int p = 0;
        for (int i = 0; i < m; i++) {
            int k = n - 1;
            for (int j = 0; j < n; j++) {
                newArray[i][j] = array[k][p];
                System.out.print(newArray[i][j] + " ");
                if (k > 0) {
                    k--;
                }
            }
            p++;
            System.out.println();
        }
    }
}

