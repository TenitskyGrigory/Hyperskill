package src.Coffee_Machine.CM_V4;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine(400, 540, 120, 9, 550);
        String action = "";

        System.out.println(machine.toString());
        System.out.println();
        System.out.println("Write action (buy, fill, take): ");
        action = scanner.nextLine();
        System.out.println();

        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: \n");
                int buyCoffee = scanner.nextInt();
                if (buyCoffee == 1) {
                    machine.buyEspresso();
                } else if (buyCoffee == 2) {
                    machine.buyLatte();
                } else if (buyCoffee == 3) {
                    machine.buyCappuccino();
                }
                break;
            case "fill":
                machine.fillMachine();
                break;
            case "take":
                machine.takeMoney();
                break;
        }
    }
}
