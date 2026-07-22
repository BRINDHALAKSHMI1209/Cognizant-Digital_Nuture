import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];
            else if (products[mid].productId < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(105, "Mobile", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Bag", "Fashion")
        };

        int searchId = 104;

        // Linear Search
        Product result = linearSearch(products, searchId);

        if (result != null)
            System.out.println("Linear Search: " + result.productName);
        else
            System.out.println("Product not found");

        // Sort before Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        result = binarySearch(products, searchId);

        if (result != null)
            System.out.println("Binary Search: " + result.productName);
        else
            System.out.println("Product not found");
    }
}