public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Book", "Education"),
            new Product(105, "Shoes", "Footwear")
        };

        // Linear Search
        Product found1 = SearchService.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Not Found"));

        // Prepare for binary search
        SearchService.sortProductsByName(products);

        // Binary Search
        Product found2 = SearchService.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Not Found"));
    }
}
