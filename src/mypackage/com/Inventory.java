package mypackage.com;

public class Inventory {
    private List<Product> productList;

    public Inventory() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(String uniqueIdentifier) {
        productList.removeIf(product -> product.getUniqueIdentifier().equals(uniqueIdentifier));
    }

    public Product searchProduct(String query) {
        // Implement search logic based on name or unique identifier
        // For simplicity, let's assume the query is the unique identifier
        for (Product product : productList) {
            if (product.getUniqueIdentifier().equals(query)) {
                return product;
            }
        }
        return null;
    }

}
