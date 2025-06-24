package Inventory_Management;
import java.util.HashMap;
public class Inventory {
   static HashMap<Integer,Product> inventory = new HashMap<Integer,Product>();

   public static void addProduct(Product p){
       inventory.put(p.productId,p);
       System.out.println("✅ Product added!");
   }
   public static void updateProduct(int id,int qty,int price){
       Product p = inventory.get(id);
       if(p!=null){
           p.quantity = qty;
           p.price = price;
           System.out.println("🔄 Product updated!");
       } else {
           System.out.println("❌ Product not found.");
       }
       }
       public static  void deleteProduct(int id){
           Product p = inventory.get(id);
           if(inventory.remove(p)!=null){
               System.out.println("Product deleted");
           }
           else {
               System.out.println("Product not found");
           }
       }
    public static void viewInventory() {
        System.out.println("📦 Inventory:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        addProduct(new Product(1, "Laptop", 10, 50000));
        addProduct(new Product(2, "Phone", 20, 15000));
        updateProduct(2, 18, 14500);
        deleteProduct(1);
        viewInventory();
    }
   }

