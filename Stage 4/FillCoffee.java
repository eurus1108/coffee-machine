import java.util.Scanner;

/**
 * FillCoffee
 */
class FillCoffee extends Inventory {
    private static Scanner scanner = new Scanner(System.in);

    public int addWater(int water) {
        return getWater() + water;
    }

    public int addWater() {
        System.out.println("Write how many ml of water you want to add:");
        int amountOfWater = scanner.nextInt();
        return amountOfWater + getWater();
    }

    public int addMilk() {
        System.out.println("Write how many ml of milk you want to add:");
        int amountOfMilk = scanner.nextInt();
        return amountOfMilk + getMilk();
    }

    public int addCoffeeBeans() {
        System.out.println("Write how many grams of coffee beans you want to add:");
        int amountOfCoffeeBeans = scanner.nextInt();
        return amountOfCoffeeBeans + getCoffeeBeans();
    }

    public int addDisposableCups() {
        System.out.println("Write how many disposable cups you want to add:");
        int amountOfDisposableCups = scanner.nextInt();
        return amountOfDisposableCups + getDisposableCups();
    }
}