/**
 * Product
 */

class Product {
    private int productId;
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups = 1;
    private int price;

    public Product() {
    }

    public Product(int productId, int water, int milk, int coffeeBeans, int price) {
        this.productId = productId;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.price = price;
    }

    public int[] productInfo() {
        return new int[] { water, milk, coffeeBeans, disposableCups };
    }

    public int getProductId() {
        return productId;
    }

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

    public int getPrice() {
        return price;
    }
}