package src.Different_tasks.Iterating_over_arrays;
/**
 * Check if an array contains two numbers
 * Write a program that reads an unsorted array of integers and two numbers n and m.
 * The program must check if n and m occur next to each other in the array (in any order).
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array.
 * The third line contains two integer numbers n and m.
 * All numbers in the same line are separated by the space character.
 *
 * Output data format
 *
 * Only a single value: true or false.
 */

import java.util.Scanner;

public class Check_if_an_array_contains_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int findValue = scanner.nextInt();
        int findValue2 = scanner.nextInt();
        int k = 0;
        for (int j = 0; j < arrayLength - 1; j++) {
            if (findValue == array[j] && findValue2 == array[j + 1] ||
                    findValue2 == array[j] && findValue == array[j + 1]) {
                System.out.println("true");
                break;
            }
            k++;
        }
        if (k == arrayLength - 1) {
            System.out.println("false");
        }
    }
}
