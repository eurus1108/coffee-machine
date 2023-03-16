import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CoffeeMachine
 */
public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int amountOfWater = availableWater();
        int amountOfMilk = availableMilk();
        int amountOfCoffeeBeans = availableCoffeeBeans();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = 0;

        try {
            cupsOfCoffee = scanner.nextInt();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("You should input number.");
            System.exit(0);
        }

        int[] neededAmount = { 200, 50, 15 };
        int[] availableAmount = { amountOfWater, amountOfMilk, amountOfCoffeeBeans };

        int availableSupply = Integer.MAX_VALUE;
        int currentSupply = 0;

        for (int i = 0; i < neededAmount.length; i++) {
            currentSupply = availableAmount[i] / neededAmount[i];

            if (currentSupply == availableSupply) {
                continue;
            }

            if (currentSupply < availableSupply) {
                availableSupply = currentSupply;
            }
        }

        if (cupsOfCoffee == availableSupply) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (availableSupply > cupsOfCoffee) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (availableSupply - cupsOfCoffee)
                    + " more than that)");
        } else {
            System.out.println("No, I make only " + availableSupply + " cup(s) of coffee");
        }
    }

    public static int availableWater() {
        System.out.println("Write how many ml of water the coffee machine has:");

        int userInput = 0;

        try {
            userInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("You should input number.");
            System.exit(0);
        }

        return userInput;
    }

    public static int availableMilk() {
        System.out.println("Write how many ml of milk the coffee machine has:");

        int userInput = 0;

        try {
            userInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("You should input number.");
            System.exit(0);
        }

        return userInput;
    }

    public static int availableCoffeeBeans() {
        System.out.println("Write how many grams of coffee beans the coffee machine has:");

        int userInput = 0;

        try {
            userInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("You should input number.");
            System.exit(0);
        }

        return userInput;
    }
}