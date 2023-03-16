import java.util.Scanner;

/**
 * CoffeeMachine
 */
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = 0;

        try {
            cupsOfCoffee = scanner.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("You should input number.");
            System.exit(0);
        }

        int amountOfWater = cupsOfCoffee * 200;
        int amountOfMilk = cupsOfCoffee * 50;
        int amountOfCoffeeBeans = cupsOfCoffee * 15;

        System.out.println("For " + cupsOfCoffee + " cups of coffee you will need:");
        System.out.println(amountOfWater + " ml of water");
        System.out.println(amountOfMilk + " ml of milk");
        System.out.println(amountOfCoffeeBeans + " g of coffee beans");
    }
}