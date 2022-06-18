package src.Different_tasks;

/**
 * Shape
 * Write a program, which reads the number of the shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus)
 * and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number).
 * If it is a number that doesn't correspond to any of the listed shapes, the program should output: "There is no such shape!".
 *
 * Note: the output text should exactly match the sample, including letters' case and location of spaces.
 */

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch(value) {
            case 1:
                System.out.println("You have chosen a square");
                break;
            case 2:
                System.out.println("You have chosen a circle");
                break;
            case 3:
                System.out.println("You have chosen a triangle");
                break;
            case 4:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
        }
    }
}

