package src.Different_tasks;

import java.util.Scanner;

public class The_integer_barrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i == 0) {
                sum += i;
                break;
            }
            if (sum < 1000) {
                sum += i;
            } else {
                break;
            }
        }
        if (sum >= 1000) {
            sum -= 1000;
        }
        System.out.println(sum);
    }
}