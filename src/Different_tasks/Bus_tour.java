package src.Different_tasks;
/**
 * A bus tour of Europe has been very successful. Due to an increase in the number of people who want to go on a tour,
 * the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.
 *
 * But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges.
 * Can you find out if this will happen?
 *
 * The first line of the input contains the height of the bus and the number of bridges under which the bus passes.
 * The second line contains the heights of these bridges.
 *
 * You should output "Will not crash" if everything will be alright; otherwise, output "Will crash on bridge i"
 * (where i is the number of the bridge) into which the bus will crash. If the height of a bridge equals the height of the bus,
 * the bus will crash.
 */

import java.util.Scanner;

public class Bus_tour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= numberOfBridges; i++) {
            int heightBridge = scanner.nextInt();
            if (heightBridge <= heightBus) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else {
                count++;
            }
        }
        if (count == numberOfBridges) {
            System.out.println("Will not crash");
        }
    }
}
