package mypackage.com;

public class Category {
        private String categoryName;
        private Map<String, String> categoryAttributes;

        public Category(String categoryName, Map<String, String> categoryAttributes) {
            this.categoryName = categoryName;
            this.categoryAttributes = categoryAttributes;
        }

        public void displayDetails() {
            System.out.println("Category: " + categoryName);
            System.out.println("Category Attributes: " + categoryAttributes);
        }
    }


