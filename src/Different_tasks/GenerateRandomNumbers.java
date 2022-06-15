package src.Different_tasks;

import java.util.Random;
import java.util.Scanner;

/**
 * Generate random numbers
 * You are given three numbers: n , a and b.
 *
 * Your task is to output the sum of the first n random numbers in a range from a to b inclusively.
 * The seed of the generator should be set as a + b.
 *
 * The input contains numbers in a single line in the following order: n, a, b.
 */

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();


        Random random = new Random(upper + lower);
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int next = random.nextInt(upper - lower + 1) + lower;
            sum += next;
        }
        System.out.println(sum);
    }
}
