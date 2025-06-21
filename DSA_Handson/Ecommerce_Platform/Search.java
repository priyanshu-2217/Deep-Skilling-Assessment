package Ecommerce_Platform;
import java.util.Comparator;
import java.util.Arrays;
public class Search {

    public static Product linearSearch(Product [] list, String target){
        for(Product p:list){
            if(p.name.equalsIgnoreCase(target)){
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] list, String target) {
        int low = 0, high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int res = list[mid].name.compareToIgnoreCase(target);

            if (res == 0) return list[mid];
            else if (res < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] items = {
                new Product(1, "Phone", "Electronics"),
                new Product(2, "Book", "Education"),
                new Product(3, "Shoes", "Fashion"),
                new Product(4, "Laptop", "Electronics")
        };

        System.out.println("Linear Search:");
        Product result1 = linearSearch(items, "Book");
        if (result1 != null) System.out.println("Found: " + result1);
        else System.out.println("Not found");

        Arrays.sort(items, Comparator.comparing(p -> p.name.toLowerCase()));

        System.out.println("Binary Search:");
        Product result2 = binarySearch(items, "Shoes");
        if (result2 != null) System.out.println("Found: " + result2);
        else System.out.println("Not found");
    }
}
