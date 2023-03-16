import java.util.ArrayList;
import java.util.Scanner;

/**
 * CoffeeMachine
 */
public class CoffeeMachine {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.greeting();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine().toLowerCase();

        switch (action) {
            case "buy":
                buyCoffee();
                break;
            case "fill":
                fillCoffee();
                break;
            case "take":
                withdrawal();
                break;
            default:
                break;
        }
    }

    public static void fillCoffee() {
        FillCoffee fill = new FillCoffee();
        int water = fill.addWater();
        int milk = fill.addMilk();
        int coffeeBeans = fill.addCoffeeBeans();
        int disposableCups = fill.addDisposableCups();

        System.out.println();
        fill.outputMessage(water, milk, coffeeBeans, disposableCups, fill.getEarnings());
    }

    public static void buyCoffee() {
        BuyCoffee buy = new BuyCoffee();
        int[] typeOfCoffee = buy.buyCoffee();

        System.out.println();
        buy.outputMessage(typeOfCoffee);
    }

    public static void withdrawal() {
        Inventory inventory = new Inventory();
        int withdrawal = inventory.getEarnings() - inventory.getEarnings();
        System.out.println("I gave you $" + inventory.getEarnings());

        System.out.println();
        inventory.outputMessage(inventory.getWater(), inventory.getMilk(), inventory.getCoffeeBeans(),
                inventory.getDisposableCups(), withdrawal);
    }

}