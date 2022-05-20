package src.Coffee_Machine;

/**
 * Stage 2/6: Ingredient calculator
 * Description
 * Now let's consider a case where you need a lot of coffee. Maybe, for example, you’re hosting a party with a lot of guests.
 * The program should calculate how much water, coffee, and milk are necessary to make the specified amount of coffee.
 * One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
 *
 * The user should input the amount of coffee he needs, in cups, for all the guests.
 *
 * Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any coffee.
 *
 * Instruction
 * Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.
 */

import java.util.Scanner;

public class CM_V2 {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need: ");
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();

        System.out.println("For " + cups + " cups of coffee you will need:\n"
                + cups * 200 + " ml of water\n" + cups * 50 + " ml of milk\n" + cups * 15 + " g of coffee beans");
    }
}
