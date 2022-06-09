package src.Coffee_Machine.CM_V5;

import java.util.Scanner;

/**
 * Description
 * But just one action isn’t interesting. Let's improve the program so it can do multiple actions,
 * one after another. The program should repeatedly ask what the user wants to do.
 * If the user types "buy", "fill" or "take", then just do what the program did in the previous step.
 * However, if the user wants to switch off the coffee machine, he should type "exit".
 * Then the program should terminate. Also, when the user types "remaining",
 * the program should output all the resources that the coffee machine has.
 * This means that you shouldn't show the remaining stock levels at the beginning/end of the program.
 *
 * Also, do not forget that you can be out of resources for making coffee.
 * If the coffee machine doesn’t have enough resources to make coffee,
 * the program should output a message that says it can't make a cup of coffee and state what is missing.
 *
 * And the last improvement to the program at this step—if the user types
 * "buy" to buy a cup of coffee and then changes his mind, he should be able to type
 * "back" to return into the main cycle.
 *
 * Remember, that:
 *
 * For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
 * For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
 * And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
 */

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
