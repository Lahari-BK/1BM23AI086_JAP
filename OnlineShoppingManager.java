package javalab;

public class OnlineShoppingManager {
}
import java.util.Vector;

class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + name + '\'' +
                ", Price=" + price +
                ", Category='" + category + '\'' +
                '}';
    }
}

class OnlineShoppingManager {
    private Vector<Product> inventory;

    public OnlineShoppingManager() {
        inventory = new Vector<>();
    }
    public void addProduct(Product product) {
        inventory.add(product);
        System.out.println(product.getName() + " added to inventory.");
    }
    public void removeProduct(String productName) {
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(productName)) {
                inventory.remove(product);
                System.out.println(productName + " removed from inventory.");
                return;
            }
        }
        System.out.println(productName + " not found in inventory.");
    }
    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }
}

public class OnlineShoppingPlatform {
    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();

        manager.addProduct(new Product("Laptop", 75000, "Electronics"));
        manager.addProduct(new Product("Shoes", 2000, "Fashion"));
        manager.addProduct(new Product("Book", 500, "Education"));
        manager.displayInventory();
        manager.removeProduct("Shoes");
        manager.displayInventory();
    }
}
