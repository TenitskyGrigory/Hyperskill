package src.Coffee_Machine;

import java.util.Scanner;
public class Example {
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
        int k = scanner.nextInt();
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if(count == k) {
                break;
            }
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 0) {
                    ++count;
                } else {
                    count = 0;
                }
                if (count == k) {
                    System.out.print(i + 1);
                    break;
                }
            }
            count2++;
        }
        if (count2 == n && count != k) {
            System.out.println("0");
        }
    }
}