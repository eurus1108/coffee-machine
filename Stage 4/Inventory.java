/**
 * Inventory
 */
class Inventory {
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int disposableCups = 9;
    private int earnings = 550;

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public int getEarnings() {
        return earnings;
    }

    public void greeting() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + earnings + " of money");
        System.out.println();
    }

    public void outputMessage(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public void outputMessage(int[] message) {
        System.out.println("The coffee machine has:");
        System.out.println(message[0] + " ml of water");
        System.out.println(message[1] + " ml of milk");
        System.out.println(message[2] + " g of coffee beans");
        System.out.println(message[3] + " disposable cups");
        System.out.println("$" + message[4] + " of money");
    }
}