package src.Different_tasks;
/**
 * Null or not
 * Write a method that checks if the object passed to it is null or not.
 * If it is null, the method must print "It's null" and if not it must print
 * "It's an object".
 */

import java.util.Scanner;

class Solution {
    public void printIsNull(Object o) {
        if (o == null) {
            System.out.println("It's null");
        } else {
            System.out.println("It's an object");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Object obj = "null".equals(scanner.nextLine()) ? null : new Object();
            solution.printIsNull(obj);
        }
    }
}

