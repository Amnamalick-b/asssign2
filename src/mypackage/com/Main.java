package mypackage.com;

public class Main {
        public static void main(String[] args) {
            Map<String, String> electronicAttributes = new HashMap<>();
            electronicAttributes.put("Operating System", "Android");
            electronicAttributes.put("Storage Capacity", "128GB");
            electronicAttributes.put("Camera Resolution", "12MP");

            Product smartphone = new Product("Smartphone", 499.99, 50, "P001", electronicAttributes);

            Category electronicCategory = new Category("Electronics", electronicAttributes);

            Inventory inventory = new Inventory();
            inventory.addProduct(smartphone);

            Product foundProduct = inventory.searchProduct("P001");
            if (foundProduct != null) {
                foundProduct.displayDetails();
            } else {
                System.out.println("Product not found.");
            }
        }
    }

