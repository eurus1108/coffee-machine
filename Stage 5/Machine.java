import java.util.Scanner;

/**
 * Machine
 */
class Machine {
    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBeans = 120;
    private static int disposableCups = 9;
    private static int earnings = 550;
    private static final Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String option = scanner.next().toLowerCase();

        switch (option) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                remaining();
                break;
            case "exit":
                break;
            default:
                System.out.println("Unexpected action. ");
                System.out.println();
                break;
        }
    }

    private static Product[] productList() {
        return new Product[] {
                new Product(1, 250, 0, 16, 4),
                new Product(2, 350, 75, 20, 7),
                new Product(3, 200, 100, 12, 6)
        };
    }

    private static void buy() {
        Product[] productList = productList();
        Product product = new Product();

        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String command = scanner.next().toLowerCase();

        if (command.equals("back")) {
            System.out.println();
            run();
            return;
        }

        int order = 0;

        try {
            order = Integer.parseInt(command);
        } catch (Exception e) {
            // TODO: handle exception
            buy();
        }

        for (int i = 0; i < productList.length; i++) {
            if (productList[i].getProductId() == order) {
                product = productList[i];
                break;
            }
        }

        boolean isAvailable = checkIfAvailable(product);

        if (isAvailable) {
            System.out.println("I have enough resources, making you a coffee! ");
            System.out.println();

            water -= product.getWater();
            milk -= product.getMilk();
            coffeeBeans -= product.getCoffeeBeans();
            disposableCups -= product.getDisposableCups();
            earnings += product.getPrice();
        }

        run();
    }

    private static boolean checkIfAvailable(Product product) {
        int[] inventory = { water, milk, coffeeBeans, disposableCups };
        String[] itemName = { "water", "milk", "coffee beans", "disposable cups" };
        boolean isAvailable = true;

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] < product.productInfo()[i]) {
                System.out.println("Sorry, not enough " + itemName[i] + "!");
                System.out.println();
                isAvailable = false;
                break;
            }
        }

        return isAvailable;
    }

    private static void fill() {
        System.out.println();
        System.out.println("Write how many ml of water you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        disposableCups += scanner.nextInt();
        System.out.println();
        run();
    }

    private static void take() {
        System.out.println();
        System.out.println("I gave you $" + earnings);
        earnings -= earnings;
        System.out.println();
        run();
    }

    private static void remaining() {
        System.out.println();
        System.out.println("The coffee machine has: ");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + earnings + " of money");
        System.out.println();
        run();
    }
}