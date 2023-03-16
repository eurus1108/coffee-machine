import java.util.Scanner;

/**
 * BuyCoffee
 */
class BuyCoffee extends Inventory {

    public int[] buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int option = scanner.nextInt();
        int[] typeOfCoffee = new int[5];

        switch (option) {
            case 1:
                typeOfCoffee = espresso();
                break;
            case 2:
                typeOfCoffee = latte();
                break;
            case 3:
                typeOfCoffee = cappuccino();
                break;
            default:
                break;
        }

        return typeOfCoffee;
    }

    public int water() {
        return getWater() - 100;
    }

    private int[] espresso() {
        int water = getWater() - 250;
        int coffeeBeans = getCoffeeBeans() - 16;
        int disposableCups = getDisposableCups() - 1;
        int moneyEarned = getEarnings() + 4;
        int[] output = { water, getMilk(), coffeeBeans, disposableCups, moneyEarned };

        return output;
    }

    private int[] latte() {
        int water = getWater() - 350;
        int milk = getMilk() - 75;
        int coffeeBeans = getCoffeeBeans() - 20;
        int disposableCups = getDisposableCups() - 1;
        int moneyEarned = getEarnings() + 7;
        int[] output = { water, milk, coffeeBeans, disposableCups, moneyEarned };

        return output;
    }

    private int[] cappuccino() {
        int water = getWater() - 200;
        int milk = getMilk() - 100;
        int coffeeBeans = getCoffeeBeans() - 12;
        int disposableCups = getDisposableCups() - 1;
        int moneyEarned = getEarnings() + 6;
        int[] output = { water, milk, coffeeBeans, disposableCups, moneyEarned };

        return output;
    }
}