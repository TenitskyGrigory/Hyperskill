package src.Different_tasks;

/**
 * Detail manufacturing
 * John decided to create a manufacturing firm. It produces various, mainly mechanical details.
 * John wants to automate details producing requests, but sadly he cannot write code.
 * He asks you to write a simple manufacturing controller.
 * You are given two methods, requestProduct and getNumberOfProducts:
 *
 * getNumberOfProducts should return the total number of requested products;
 * requestProduct should keep track of requested products, and format the product argument in the format:
 * No. Requested Detail.
 *
 * For example:
 *
 * ManufacturingController.requestProduct("detail 1");
 * should return: "1. Requested detail 1"
 *
 * and
 *
 * ManufacturingController.requestProduct("Wrench");
 * should return: "2. Requested Wrench"
 *
 * After execution of these two commands,
 *
 * ManufacturingController.getNumberOfProducts();
 * should return: "2"
 */

import java.util.Scanner;

public class ManufacturingController {
    // here you may declare a field
    public static int numberOfProduct = 0;

    public static String requestProduct(String product) {
        // write your code here
        numberOfProduct++;
        return numberOfProduct + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return numberOfProduct;
    }
}

class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}
