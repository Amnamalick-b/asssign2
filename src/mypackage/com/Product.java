package mypackage.com;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;
    private String uniqueIdentifier;
    private Map<String, String> categoryAttributes;

    public Product(String name, double price, int stockQuantity, String uniqueIdentifier, Map<String, String> categoryAttributes) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.uniqueIdentifier = uniqueIdentifier;
        this.categoryAttributes = categoryAttributes;
    }


    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Unique Identifier: " + uniqueIdentifier);
        System.out.println("Category Attributes: " + categoryAttributes);
    }
}



