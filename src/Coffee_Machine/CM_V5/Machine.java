package src.Coffee_Machine.CM_V5;

import java.util.Scanner;

public class Machine {
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    public Machine(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }


    public void setWater(int water) {
        this.water = water;
    }


    public void setMilk(int milk) {
        this.milk = milk;
    }


    public void setBeans(int beans) {
        this.beans = beans;
    }


    public void setCups(int cups) {
        this.cups = cups;
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
        if(water >= 250 && beans >= 16 && cups >= 1) {
            setWater(water -= 250);
            setBeans(beans -= 16);
            setCups(cups-= 1);
            setMoney(money += 4);
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < 250){
            System.out.println("Sorry, not enough water!");
        } else if (beans < 16){
            System.out.println("Sorry, not enough beans!");
        } else if (cups < 1){
            System.out.println("Sorry, not enough cups!");
        }
    }

    public void buyLatte() {
        if(water >= 350 && milk >= 75 && beans >= 16 && cups >= 1) {
            setWater(water -= 350);
            setMilk(milk -= 75);
            setBeans(beans -= 20);
            setCups(cups -= 1);
            setMoney(money += 7);
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 20) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }

    public void buyCappuccino() {
        if(water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            setWater(water -= 200);
            setMilk(milk -= 100);
            setBeans(beans -= 12);
            setCups(cups -= 1);
            setMoney(money += 6);
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 12) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }

    public void fillMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = scanner.nextInt();
        setWater(water += addWater);
        setMilk(milk += addMilk);
        setBeans(beans += addBeans);
        setCups(cups += addCups);
    }

    public void takeMoney() {
        System.out.println("I gave you $" + money);
        System.out.println();
        money = 0;
    }

    public void remainingInMachine() {
        System.out.println(toString());
    }
}
