package src.Different_tasks;

/**
 * Count how many times a number occurs
 * Write a program that reads an array of ints and an integer number n.
 *
 * The program must check how many times n occurs in the array.
 *
 * Input data format
 * The first line contains the size of the input array.
 *
 * The second line contains elements of the array separated by spaces.
 *
 * The third line contains n.
 */

import java.util.Scanner;

public class Iterating_over_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int findValue = scanner.nextInt();
        int count = 0;
        for (int i : array) {
            if (i == findValue) {
                count++;
            }
        }
        System.out.println(count);
    }
}