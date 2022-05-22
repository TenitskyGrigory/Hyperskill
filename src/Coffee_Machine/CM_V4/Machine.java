package src.Coffee_Machine.CM_V4;

import java.util.Scanner;

public class Machine {
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;

    public Machine(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" + water + " ml of water\n"
                + milk + " ml of milk\n" + beans + " g of coffee beans\n"
                + cups + " disposable cups\n" + money + " of money\n";
    }

    public void buyEspresso() {
        setWater(water -= 250);
        setBeans(beans -= 16);
        setCups(cups-= 1);
        setMoney(money += 4);
        System.out.println(toString());
    }

    public void buyLatte() {
        water -= 350;
        milk -= 75;
        beans -= 20;
        cups -= 1;
        money += 7;
        System.out.println(toString());
    }

    public void buyCappuccino() {
        water -= 200;
        milk -= 100;
        beans -= 12;
        cups -= 1;
        money += 6;
        System.out.println(toString());
    }

    public void fillMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:\n");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:\n");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:\n");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:\n");
        int addCups = scanner.nextInt();
        water += addWater;
        milk += addMilk;
        beans += addBeans;
        cups += addCups;
        System.out.println(toString());
    }

    public void takeMoney() {
        System.out.println("I gave you $" + money);
        System.out.println();
        money = 0;
        System.out.println(toString());
    }
}
