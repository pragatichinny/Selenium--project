package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Product class implementing Comparable
class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Compare products by price (ascending)
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}

public class ProductSortDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Add products
        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(102, "Phone", 20000));
        products.add(new Product(103, "Tablet", 30000));
        products.add(new Product(104, "Monitor", 15000));

        // Display before sorting
        System.out.println("Before sorting:");
        for (Product p : products) {
            System.out.println(p);
        }

        // Sort products by price (ascending)
        Collections.sort(products);

        // Display after sorting
        System.out.println("\nAfter sorting by price:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
