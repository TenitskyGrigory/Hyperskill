package src.Different_tasks;

/**
 * String reverser
 * There is an interface StringReverser:
 *
 * interface StringReverser {
 *
 *     String reverse(String str);
 * }
 * You should create an anonymous class that implements the interface and assign the instance to the variable reverser.
 * The anonymous class must override the method reverse of the interface. It should return the reversed input string.
 */

import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser1 reverser = new StringReverser1() {
            @Override
            public String reverse(String str) {
                return new StringBuilder(str).reverse().toString();
            }
        };
        System.out.println(reverser.reverse(line));
    }

    interface StringReverser1 {

        String reverse(String str);
    }

}
