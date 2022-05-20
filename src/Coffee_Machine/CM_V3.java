package src.Coffee_Machine;

import java.util.Scanner;

public class CM_V3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int hasWater = water / 200;
        int hasMilk = milk / 50;
        int hasBeans = beans / 15;

        int min = getMin(hasWater, hasMilk, hasBeans);

        if(min == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if(min == 0) {
            System.out.println("No, I can make only 0 cup(s) of coffee");
        } else if(min < cups) {
            System.out.println("No, I can make only " + min + " cup(s) of coffee");
        } else if(min > cups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (min - cups) + " more than that)");
        }
    }

    private static int getMin(int hasWater, int hasMilk, int hasBeans) {
        int min = 0;
        if(hasWater <= hasMilk) {
            min = hasWater;
        } else {
            min = hasMilk;
        }
        if(min <= hasBeans) {
            min = min;
        } else {
            min = hasBeans;
        }
        return min;
    }
}
