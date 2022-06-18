package src.Different_tasks.Iterating_over_arrays;
/**
 * Cyclically shifting elements
 * Write a program that reads an array of ints named a and cyclically shift the elements of the array to the right:
 * a[0] goes to the place of a[1], a[1] goes to the place of a[2], ..., and the last element goes to the place of a[0]).
 *
 * Input data format
 *
 * The first line of the input contains the number of elements in the array. The second line contains the elements of the array.
 *
 * Output data format
 *
 * The single line should contain all shifted elements of the array. Elements must be separated by the space character.
 *
 * Note that If your solution gets the code quality warning "System.arraycopy is more efficient",
 * please simply ignore it in respect of this code challenge.
 */

import java.util.Scanner;

public class Cyclically_shifting_elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int value = array[arrayLength - 1];
        for (int j = arrayLength - 1; j > 0; j--) {
            array[j] = array[j - 1];
        }
        array[0] = value;
        for (int k = 0; k < arrayLength; k++) {
            System.out.print(array[k] + " ");
        }
    }
}
