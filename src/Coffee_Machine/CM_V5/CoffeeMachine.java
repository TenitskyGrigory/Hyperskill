package src.Coffee_Machine.CM_V5;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine(400, 540, 120, 9, 550);
        String action;

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = scanner.nextLine();


            label:
            switch (action) {
                case "buy" -> {
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to menu: ");
                    String buyCoffee = scanner.nextLine();
                    switch (buyCoffee) {
                        case "1":
                            machine.buyEspresso();
                            System.out.println();
                            break;
                        case "2":
                            machine.buyLatte();
                            System.out.println();
                            break;
                        case "3":
                            machine.buyCappuccino();
                            System.out.println();
                            break;
                        case "back":
                            System.out.println();
                            break label;
                    }
                }
                case "fill" -> machine.fillMachine();
                case "take" -> machine.takeMoney();
                case "remaining" -> {
                    System.out.println();
                    machine.remainingInMachine();
                }
            }
        } while (!(action.equals("exit")));
    }
}
